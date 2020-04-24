package com.lgsvc.wxserv.service.impl;

import com.lgsvc.wxserv.dao.ChxChannelCurDao;
import com.lgsvc.wxserv.dto.ChxCurExecution;
import com.lgsvc.wxserv.entity.ChxChannelCurEntity;
import com.lgsvc.wxserv.enums.ChannelCustomStateEnum;
import com.lgsvc.wxserv.enums.ChxCurStateEnum;
import com.lgsvc.wxserv.service.ChxCurService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ChxCurServiceImpl implements ChxCurService {
    @Autowired
    ChxChannelCurDao chxDao;
    private final static Logger LOG = LoggerFactory.getLogger(ChxCurServiceImpl.class);

    @Override
    public ChxCurExecution ChxCurList(Integer customId, String chx,Integer rowIndex, Integer pageSize ) {
        ChxCurExecution se = new ChxCurExecution();

        //客户的Id怎么会为负数呢？主要检查integer的判断
        if (customId.intValue() <= 0 )  {
            se.setState(ChxCurStateEnum.NULL_CUSTOMID.getState());
            se.setStateInfo(ChxCurStateEnum.NULL_CUSTOMID.getStateInfo());
            return se;
        }

        if ("".equals(chx))  {
            se.setState(ChxCurStateEnum.NULL_HAX.getState());
            se.setStateInfo(ChxCurStateEnum.NULL_HAX.getStateInfo());
            return se;
        }

        List<ChxChannelCurEntity> chxList = chxDao.queryChxChannelCurList(customId, chx, rowIndex, pageSize);
        int count = chxDao.queryChxChannelCurCount(customId,chx);
        if (chxList != null) {
            se.setChxCurList(chxList);
            se.setCount(count);
            se.setState(ChannelCustomStateEnum.SUCCESS.getState());
            se.setStateInfo(ChannelCustomStateEnum.SUCCESS.getStateInfo());
        } else {
            se.setState(ChannelCustomStateEnum.INNER_ERROR.getState());
            se.setStateInfo(ChannelCustomStateEnum.INNER_ERROR.getStateInfo());
        }
        return se;
    }


}
