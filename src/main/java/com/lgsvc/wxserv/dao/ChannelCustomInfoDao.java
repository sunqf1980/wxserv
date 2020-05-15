package com.lgsvc.wxserv.dao;


import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备客户接口类
 *
 * @author sunqf1980@163.com
 */
public interface ChannelCustomInfoDao {
    /**
     * Channel端管理接口
     * 主要以channel表为主进行数据查询
     *
     * @param awardCondition
     * @param rowIndex
     * @param pageSize
     * @return
     * @function ChannelCustomInfoDao
     */
    public List<ChannelCustomInfoEntity> queryChannelCustomInfo(Integer customerId);

    /**
     * Channel端管理接口
     * 主要以channel表为主进行数据查询--获取表的个数-----
     *
     * @param awardCondition
     * @param rowIndex
     * @param pageSize
     * @return
     * @function ChannelCustomInfoDao
     */
    public Integer queryChannelCustomInfoCountByCustomId(Integer customerId);


    /**
     * Channel端管理接口
     * 主要以channel表为主进行数据查询
     *
     * @param awardCondition
     * @param rowIndex
     * @param pageSize
     * @return
     * @function ChannelCustomInfoDao
     */
    public ChannelCustomInfoEntity queryCustomAndChannelEntity(@Param("customerid")  Integer customerId,
                                                                     @Param("channelid") String channelId);

    /**
     * Channel端管理接口
     * 主要以channel表为主进行数据查询
     *
     * @param awardCondition
     * @param rowIndex
     * @param pageSize
     * @return
     * @function ChannelCustomInfoDao
     */
    public Integer queryCustomAndChannelEntityCount(@Param("customerid")  Integer customerId,
                                                    @Param("channelid") String channelId);


}
