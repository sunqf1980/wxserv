package com.liuge.wxserv.dao;

import com.liuge.wxserv.entity.Area;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class AreaDaoTest {
    @Autowired
    private AreaDao areDao;

    @Test
    void queryArea() {
        List<Area> areaList = areDao.queryArea();
        int expected;
        assertEquals(2, areaList.size());
    }

    @Test
    void queryAreaById() {
    }

    @Test
    void insertArea() {
        //创建一个区域对象
        Area area = new Area();
        area.setAreaName("沈阳");
        area.setCreateTime(new Date());
        area.setPriority(1);
        //将该对象实例添加入库
        int effectedNum = areDao.insertArea(area);
        //检测影响行数
        assertEquals(1, effectedNum);
        //校验总数是否+1
        List<Area> areaList = areDao.queryArea();
//        assertEquals(3, areaList.size());
    }


    @Test
    void updateArea() {
    }

    @Test
    void deleteArea() {
        List<Area> areaList = areDao.queryArea();
        for (Area area : areaList) {
            if ("测试区域".equals(area.getAreaName())) {
                int effectedNum = areDao.deleteArea(area.getAreaId());
                assertEquals(1, effectedNum);
            }
        }
        // 重新获取一次列表，看看总数是否少1
        areaList = areDao.queryArea();
        assertEquals(2, areaList.size());
    }

}