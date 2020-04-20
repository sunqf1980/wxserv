package com.liuge.wxserv.dao;

import com.liuge.wxserv.entity.RealTimeMonitor;

import java.util.List;

public interface RealTimeMonitorDao {

    List<RealTimeMonitor> queryRealTimeMonitorByCustomerId(Integer customerId);
}
