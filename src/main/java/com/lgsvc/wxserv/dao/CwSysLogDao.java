package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwSysLogEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CwSysLogDao {
    public List<CwSysLogEntity> queryCwSysLogList(@Param("customer_Id") Integer customer_Id,
                                                  @Param("rowIndex") Integer rowIndex,
                                                  @Param("pageSize") Integer pageSize);

    public Integer queryCwSysLogListCount(@Param("customer_Id") Integer customer_Id);
}
