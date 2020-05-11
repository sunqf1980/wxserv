package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.TbSysResourceEntity;
import com.lgsvc.wxserv.entity.TbWarnInfoEntity;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TbWarnInfoDaoTest {

    @Autowired
    TbWarnInfoDao tbWarnInfoDao;

    @Test
    void testQueryTbWarnInfoList() {
        List<TbWarnInfoEntity> chxList= tbWarnInfoDao.queryTbWarnInfoList(12345, 0,20);
        System.out.print(chxList.toString());
    }

    @Test
    public void testInsertTbWarnInfo() throws Exception {

        Date curDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        // 创建奖品一
        TbWarnInfoEntity tb = new TbWarnInfoEntity();
        tb.setCustomerId(12345);
        tb.setChannelId("CH1");
        tb.setWarnLev(2);
        tb.setCurDatatime(curDate);
        tb.setFormatData(df.format(curDate));
        tb.setCustomPhone("13816720799");
        tb.setCustomWxchat("sunqf1980");
        tb.setWranStat("00");
        tb.setWarnDesc("测试CH1");
        tb.setWarnInfo("ok,开始进行测试");

        Integer effectedNum = tbWarnInfoDao.insertTbWarnInfo(tb);


    }
    @Test
    public void testUpdateTbWarnInfo() throws Exception {
        TbWarnInfoEntity tb = new TbWarnInfoEntity();
        tb.setWarnId(1);
        tb.setChannelDesc("这是测试的机器");

        Integer effectedNum = tbWarnInfoDao.updateTbWarnInfo(tb);

    }
}