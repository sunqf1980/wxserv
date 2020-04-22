package com.lgsvc.wxserv.service;

import com.lgsvc.wxserv.dto.ChannelCustomExecution;

/**
 * 设备-客户查询交易接口
 *
 * @author sunqf1980@163.com
 */
public interface ChannelCustomInfoService {

    /**
     *
     * @return
     */
   public ChannelCustomExecution getChannelCustomList(Integer customId);


}
