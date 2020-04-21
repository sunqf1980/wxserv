package com.lgsvc.wxserv.dao;

import com.lgsvc.wxserv.entity.RealTimeMonitor;

import java.util.List;

public interface RealTimeMonitorDao {

    List<RealTimeMonitor> queryRealTimeMonitorByCustomerId(Integer customerId);
}
