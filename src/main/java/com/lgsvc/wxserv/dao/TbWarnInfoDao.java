package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.TbWarnInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbWarnInfoDao {

    public List<TbWarnInfoEntity> queryTbWarnInfoList(@Param("customer_Id") Integer customer_Id,
                                                      @Param("rowIndex") Integer rowIndex,
                                                      @Param("pageSize") Integer pageSize);

    public Integer querTbWarnInfoListNewcount(@Param("customer_Id") Integer customer_Id,
                                              @Param("is_show_front") Integer is_show_front );

    public Integer querTbWarnInfoListcount(@Param("customer_Id") Integer customer_Id);

    public Integer insertTbWarnInfo(TbWarnInfoEntity tbWarnInfoEntity);

    public Integer updateTbWarnInfo(TbWarnInfoEntity tbWarnInfoEntity);
}
