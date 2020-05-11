package com.lgsvc.wxserv.service.impl;

import com.lgsvc.wxserv.service.TbWarnInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TbWarnInfoServiceImpl implements TbWarnInfoService {
    private final static Logger LOG = LoggerFactory.getLogger(ChxCurServiceImpl.class);

    @Override
    public void autoTaekSacnTbTempCurr() {
        Date curDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    }
}
