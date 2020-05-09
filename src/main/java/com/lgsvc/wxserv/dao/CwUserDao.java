package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwUserEntity;


public interface CwUserDao {


    /**
     * 根据Id列出具体区域
     *
     * @return area
     */
    CwUserEntity queryCwUserById(String areaId);

}
