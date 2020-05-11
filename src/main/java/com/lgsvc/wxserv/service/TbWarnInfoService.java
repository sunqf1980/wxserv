package com.lgsvc.wxserv.service;

public interface TbWarnInfoService {

    /**
     * 自动任务，每隔10秒后扫描进行插入tb_warn_info表中
     */
    public void autoTaekSacnTbTempCurr();

}
