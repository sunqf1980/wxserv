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
    public ChxCurExecution ChxCurList(Integer customId, String chx, Integer rowIndex, Integer pageSize ) {
        ChxCurExecution se = new ChxCurExecution();

        //客户的Id怎么会为负数呢？主要检查integer的判断
        if (customId.intValue() <= 0 )  {
            LOG.error("交易chx_curr_channel，上送的customer_id为空"+customId);
            se.setState(ChxCurStateEnum.NULL_CUSTOMID.getState());
            se.setStateInfo(ChxCurStateEnum.NULL_CUSTOMID.getStateInfo());
            throw new RuntimeException();
        }

        if ("".equals(chx))  {
            LOG.error("交易chx_curr_channel，上送的channel_id为空"+chx);
            se.setState(ChxCurStateEnum.NULL_HAX.getState());
            se.setStateInfo(ChxCurStateEnum.NULL_HAX.getStateInfo());
            throw new RuntimeException();
        }
        int count = chxDao.queryChxChannelCurCount(customId,chx);
        if(count <= 0){
            LOG.error("交易chx_curr_channel，数据库错误,或许没有["+count+"] customer_id=["+customId+"]channel_id=["+chx+"]");
            se.setState(ChxCurStateEnum.INNER_ERROR.getState());
            se.setStateInfo(ChxCurStateEnum.INNER_ERROR.getStateInfo());
            throw new RuntimeException();
        }
        List<ChxChannelCurEntity> chxList = chxDao.queryChxChannelCurList(customId, chx, rowIndex, pageSize);
        if (chxList != null) {
            se.setChxCurList(chxList);
            se.setCount(count);
            se.setState(ChannelCustomStateEnum.SUCCESS.getState());
            se.setStateInfo(ChannelCustomStateEnum.SUCCESS.getStateInfo());
            se.setChxCurList(chxList);
        } else {
            se.setState(ChannelCustomStateEnum.INNER_ERROR.getState());
            se.setStateInfo(ChannelCustomStateEnum.INNER_ERROR.getStateInfo());
        }
        return se;
    }


}
