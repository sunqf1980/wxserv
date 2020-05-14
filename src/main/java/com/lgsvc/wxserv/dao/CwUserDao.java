package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwUserEntity;


public interface CwUserDao  {


    /**
     * 根据Id列出具体区域
     *
     * @return area
     */
    public  CwUserEntity queryCwUserById(String areaId);
    public  Integer queryCwUserByIdCount(String areaId);

}
