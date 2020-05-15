package com.lgsvc.wxserv.dao;


import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;
import com.lgsvc.wxserv.entity.ChxChannelCurEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备客户接口类
 *
 * @author sunqf1980@163.com
 */
public interface ChxChannelCurDao {
    /**
     * Channel端管理接口
     * 主要以channel表为主进行数据查询
     *
     * @param  customerId
     * @param chx
     * @param pageSize
     * @return
     * @function ChannelCustomInfoDao
     */
    public List<ChxChannelCurEntity> queryChxChannelCurList(@Param("customerId")  Integer customerId,
                                                            @Param("chx") String chx,
                                                            @Param("rowIndex") Integer rowIndex,
                                                            @Param("pageSize") int pageSize);

    public Integer  queryChxChannelCurCount(@Param("customerId")  Integer customerId,
                                                       @Param("chx") String chx);
}
