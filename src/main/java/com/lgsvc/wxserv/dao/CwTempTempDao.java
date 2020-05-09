package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwTempTempEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CwTempTempDao {
    public List<CwTempTempEntity> queryChannelTempTempList(@Param("customer_Id") Integer customer_Id,
                                                           @Param("chx") String chx,
                                                           @Param("rowIndex") Integer rowIndex,
                                                           @Param("pageSize") int pageSize);

    public Integer queryChannelTempTempListcount(@Param("customer_Id") Integer customer_Id);
}

