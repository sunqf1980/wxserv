package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.CwSysLogEntity;
import com.lgsvc.wxserv.entity.TbSysResourceEntity;
import com.lgsvc.wxserv.enums.ManageEnum;

import java.util.List;

public class ManageSysLogExecution {
    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<CwSysLogEntity> cwSyslogList;
    private CwSysLogEntity cwSyslogEntity;

    //无参构造器
    public ManageSysLogExecution() {
    }

    // 操作失败的时候使用的构造器
    public ManageSysLogExecution(ManageEnum manageEnum) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public ManageSysLogExecution(ManageEnum manageEnum, CwSysLogEntity CwSysLogEntity) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.cwSyslogEntity = CwSysLogEntity;
    }

    public ManageSysLogExecution(ManageEnum manageEnum, List<CwSysLogEntity> cwSyslogList) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.cwSyslogList = cwSyslogList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CwSysLogEntity> getCwSyslogList() {
        return cwSyslogList;
    }

    public void setCwSyslogList(List<CwSysLogEntity> cwSyslogList) {
        this.cwSyslogList = cwSyslogList;
    }

    public CwSysLogEntity getCwSyslogEntity() {
        return cwSyslogEntity;
    }

    public void setCwSyslogEntity(CwSysLogEntity cwSyslogEntity) {
        this.cwSyslogEntity = cwSyslogEntity;
    }
}
