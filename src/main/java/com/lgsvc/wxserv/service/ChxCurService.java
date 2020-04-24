package com.lgsvc.wxserv.service;

import com.lgsvc.wxserv.dto.ChxCurExecution;
import com.lgsvc.wxserv.entity.ChxChannelCurEntity;

import java.util.List;

/**
 * 设备-客户查询交易接口
 *
 * @author sunqf1980@163.com
 */
public interface ChxCurService {
    /**
     *
     * @param customId
     * @param chx
     * @return
     */
    public ChxCurExecution ChxCurList(Integer customId, String chx,Integer rowIndex, Integer pageSize );
}
