package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;
import com.lgsvc.wxserv.enums.ChannelCustomStateEnum;

import java.util.List;

/**
 * 设备-客户查询交易-DTO 类
 *
 * @author sunqf1980@163.com
 */
public class ChannelCustomExecution {
    // 结果状态
    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<ChannelCustomInfoEntity> ChannelCustomInfoList;
    private ChannelCustomInfoEntity ChannelCustomInfo;

    public ChannelCustomExecution() {

    }

    // 操作失败的时候使用的构造器
    public ChannelCustomExecution(ChannelCustomStateEnum channelCustomEnumEnum) {
        this.state = channelCustomEnumEnum.getState();
        this.stateInfo = channelCustomEnumEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public ChannelCustomExecution(ChannelCustomStateEnum channelCustomEnumEnum, ChannelCustomInfoEntity channelCustomInfoEntity) {
        this.state = channelCustomEnumEnum.getState();
        this.stateInfo = channelCustomEnumEnum.getStateInfo();
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

    public void setChannelCustomInfoList(List<ChannelCustomInfoEntity> channelCustomInfoList) {
        ChannelCustomInfoList = channelCustomInfoList;
    }

    public void setChannelCustomInfo(ChannelCustomInfoEntity channelCustomInfo) {
        ChannelCustomInfo = channelCustomInfo;
    }

    public List<ChannelCustomInfoEntity> getChannelCustomInfoList() {
        return ChannelCustomInfoList;
    }

    public ChannelCustomInfoEntity getChannelCustomInfo() {
        return ChannelCustomInfo;
    }
}
