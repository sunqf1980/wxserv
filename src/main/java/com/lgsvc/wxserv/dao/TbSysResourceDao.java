package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwTempTempEntity;
import com.lgsvc.wxserv.entity.TbSysResourceEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSysResourceDao {

    public List<TbSysResourceEntity> queryTbSysResourceList(@Param("sys_name") String sys_name);

    public Integer queryTbSysResourceListCount(@Param("sys_name") String sys_name);
}
