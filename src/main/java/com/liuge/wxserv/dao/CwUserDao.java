package com.liuge.wxserv.dao;

import com.liuge.wxserv.entity.CwUser;


public interface CwUserDao {


    /**
     * 根据Id列出具体区域
     *
     * @return area
     */
    CwUser queryCwUserById(String areaId);

}
