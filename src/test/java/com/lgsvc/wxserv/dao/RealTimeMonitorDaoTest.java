package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.RealTimeMonitor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
class RealTimeMonitorDaoTest {

    @Autowired
    RealTimeMonitorDao realTimeMonitoringDao;

    @Test
    void queryRealTimeMonitoringByCustomerIdTest() {
        log.debug("-----开始");
        List<RealTimeMonitor> realTimeMonitoringList = realTimeMonitoringDao.queryRealTimeMonitorByCustomerId(12345);

        System.out.print("返回结果" + realTimeMonitoringList.size());
        log.debug("-----结束");
    }
}