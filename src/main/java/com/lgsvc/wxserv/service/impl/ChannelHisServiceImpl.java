package com.lgsvc.wxserv.service.impl;

import com.lgsvc.wxserv.dao.CwTempTempDao;
import com.lgsvc.wxserv.dto.ChannelHisExecution;
import com.lgsvc.wxserv.entity.ChxChannelCurEntity;
import com.lgsvc.wxserv.entity.CwTempTempEntity;
import com.lgsvc.wxserv.enums.ChannelHisEnum;
import com.lgsvc.wxserv.service.ChannelHisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelHisServiceImpl implements ChannelHisService {
    @Autowired
    CwTempTempDao cwTempTempDao;
    private final static Logger LOG = LoggerFactory.getLogger(ChannelHisServiceImpl.class);

    @Override
    public ChannelHisExecution getChannelHisList(Integer customId , String channel_id, Integer page_index, Integer page_size) {
        ChannelHisExecution se = new ChannelHisExecution();
        //客户的Id怎么会为负数呢？主要检查integer的判断
        if (customId.intValue() <= 0 )  {
            se.setState(ChannelHisEnum.NULL_CUSTOMID.getState());
            se.setStateInfo(ChannelHisEnum.NULL_CUSTOMID.getStateInfo());
            throw new RuntimeException();
        }

        int count = cwTempTempDao.queryChannelTempTempListcount(customId);
        if(count < 0){
            se.setState(ChannelHisEnum.INNER_ERROR.getState());
            se.setStateInfo(ChannelHisEnum.INNER_ERROR.getStateInfo());
            throw new RuntimeException();

        }
        List<CwTempTempEntity> chxHisList = cwTempTempDao.queryChannelTempTempList(customId, channel_id, page_index,page_size);
        if (chxHisList != null) {
            se.setChxHisList(chxHisList);
            se.setCount(count);
            se.setState(ChannelHisEnum.SUCCESS.getState());
            se.setStateInfo(ChannelHisEnum.SUCCESS.getStateInfo());
        } else {
            se.setState(ChannelHisEnum.INNER_ERROR.getState());
            se.setStateInfo(ChannelHisEnum.INNER_ERROR.getStateInfo());
        }
        return se;
    }
}
