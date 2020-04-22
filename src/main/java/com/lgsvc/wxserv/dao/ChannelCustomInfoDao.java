package com.lgsvc.wxserv.dao;


import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;

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
 * @function ChannelCustomInfoDao
 * @param awardCondition
 * @param rowIndex
 * @param pageSize
 * @return
 */
    public List<ChannelCustomInfoEntity> queryChannelCustomInfo(Integer customerId);
    public Integer queryChannelCustomInfoCountByCustomId(Integer customerId);

}
