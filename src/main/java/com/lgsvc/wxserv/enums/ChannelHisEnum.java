package com.lgsvc.wxserv.enums;

public enum ChannelHisEnum {
    SUCCESS(0, "操作成功"), PASS(1, "通过认证"),
    CHECK(-1, "检查中"), OFFLINE(-2, "离线中"),
    INNER_ERROR(-1001, "内部系统错误"),
    NULL_CUSTOMID(-1003, "客户号为空"),
    NULL_HAX(-1004,"通道号为空");

    private int state;
    private String stateInfo;

    private ChannelHisEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 依据传入的state返回相应的enum值
     */
    public static ChannelHisEnum stateOf(int state) {
        for (ChannelHisEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
