package com.lgsvc.wxserv.service;

import com.lgsvc.wxserv.dto.ManageRecourcceExecution;
import com.lgsvc.wxserv.dto.ManageSysLogExecution;
import com.lgsvc.wxserv.dto.TbWangInfoExecution;

public interface ManageInfoService {

     public ManageRecourcceExecution manageResourceinfoList(String sys_name);

     public ManageSysLogExecution manageSysLogList(Integer customerId, Integer pageIndex, Integer pageSize);

     public TbWangInfoExecution manageWarnInfoListCount(Integer customerId);
}
