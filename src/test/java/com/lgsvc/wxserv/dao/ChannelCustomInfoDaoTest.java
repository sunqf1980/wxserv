package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;
import com.lgsvc.wxserv.entity.CwUser;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ChannelCustomInfoDaoTest {
    @Autowired
    ChannelCustomInfoDao channelCustomInfoDao;

    @Test
    void querCwUserByUid() {
        List<ChannelCustomInfoEntity> channelCustomInfoEntityList= channelCustomInfoDao.queryChannelCustomInfo(12345);
        System.out.print(channelCustomInfoEntityList.toString());
    }

}