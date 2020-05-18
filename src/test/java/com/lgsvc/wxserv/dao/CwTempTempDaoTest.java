package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.ChxChannelCurEntity;
import com.lgsvc.wxserv.entity.CwTempTempEntity;
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
class CwTempTempDaoTest {
    @Autowired
    CwTempTempDao cwTempTempDao;

    @Test
    void testQueryChannelHis() {
        List<CwTempTempEntity> chxList= cwTempTempDao.queryChannelTempTempList(12345,"ch1","2020-05-08","2020-05-08", 0,100);
        System.out.print(chxList.toString());
    }

}