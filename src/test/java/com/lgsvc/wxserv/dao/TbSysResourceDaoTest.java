package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwTempTempEntity;
import com.lgsvc.wxserv.entity.TbSysResourceEntity;
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
class TbSysResourceDaoTest {
    @Autowired
    TbSysResourceDao tbSysResourceDao;

    @Test
    void testQueryChannelHis() {
        List<TbSysResourceEntity> chxList= tbSysResourceDao.queryTbSysResourceList("SYS_HEADIMAGE");
        System.out.print(chxList.toString());
    }


}