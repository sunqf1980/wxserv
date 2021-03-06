package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwUserEntity;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CwUserDaoTest {

    @Autowired
    CwUserDao cwUserDao;

    @Test
    void querCwUserByUid() {
        CwUserEntity cwUser = cwUserDao.queryCwUserById("sunqf");
        System.out.print(cwUser.toString());
    }

}