package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwAralmEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CwAralmDao {
    public List<CwAralmEntity> queryCwAralmListByTime(@Param("customer_Id") Integer customer_Id,
                                                @Param("rowIndex") Integer rowIndex,
                                                @Param("pageSize") Integer pageSize);
}
