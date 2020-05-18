package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.CwTempTempEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CwTempTempDao {
    public List<CwTempTempEntity> queryChannelTempTempList(@Param("customer_Id") Integer customer_Id,
                                                           @Param("chx") String chx,
                                                           @Param("fristDate") String fristDate,
                                                           @Param("lastDate") String lastDate,
                                                           @Param("rowIndex") Integer rowIndex,
                                                           @Param("pageSize") Integer pageSize);

    public Integer queryChannelTempTempListcount(@Param("customer_Id") Integer customer_Id,
                                                 @Param("fristDate") String fristDate,
                                                 @Param("lastDate") String lastDate);
}

