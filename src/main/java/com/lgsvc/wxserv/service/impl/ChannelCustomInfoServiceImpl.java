package com.lgsvc.wxserv.service.impl;

import com.lgsvc.wxserv.dao.ChannelCustomInfoDao;
import com.lgsvc.wxserv.dto.ChannelCustomExecution;
import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;
import com.lgsvc.wxserv.enums.ChannelCustomStateEnum;
import com.lgsvc.wxserv.service.ChannelCustomInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备-客户查询交易服务实现类
 *
 * @author sunqf1980@163.com
 */
@Service
public class ChannelCustomInfoServiceImpl implements ChannelCustomInfoService {
    @Autowired
    ChannelCustomInfoDao channelCustomInfoDao;
    private final static Logger LOG = LoggerFactory.getLogger(ChannelCustomInfoServiceImpl.class);

    @Override
    public ChannelCustomExecution getChannelCustomList(Integer customId) {
        ChannelCustomExecution se = new ChannelCustomExecution();
        //客户的Id怎么会为负数呢？主要检查integer的判断
        if (customId.intValue() <= 0 )  {
            se.setState(ChannelCustomStateEnum.NULL_CUSTOMID.getState());
            se.setStateInfo(ChannelCustomStateEnum.NULL_CUSTOMID.getStateInfo());
            return se;
        }
        List<ChannelCustomInfoEntity> channelCustomList = channelCustomInfoDao.queryChannelCustomInfo(customId);
        int count = channelCustomInfoDao.queryChannelCustomInfoCountByCustomId(customId);
        if (channelCustomList != null) {
            se.setChannelCustomInfoList(channelCustomList);
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
