package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ChannelCustomInfoDaoTest {
    @Autowired
    ChannelCustomInfoDao channelCustomInfoDao;

    @Test
    void testQueryChannelCustomInfo() {
        List<ChannelCustomInfoEntity> channelCustomInfoEntityList= channelCustomInfoDao.queryChannelCustomInfo(12345);
        System.out.print(channelCustomInfoEntityList.toString());
    }

}