package com.lgsvc.wxserv.enums;

/**
 * 设备-客户查询交易枚举
 *
 * @author sunqf1980@163.com
 */
public enum ChannelCustomEnum {
    CHECK(0, "审核中"), OFFLINE(-1, "非法店铺"),
          SUCCESS(1, "操作成功"), PASS(2, "通过认证"),
        INNER_ERROR(-1001,"内部系统错误"), NULL_SHOPID(-1002, "ShopId为空"),
         NULL_SHOP(-1003, "shop信息为空");

    private int state;
    private String stateInfo;

    private ChannelCustomEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 依据传入的state返回相应的enum值
     */
    public static ChannelCustomEnum stateOf(int state) {
        for (ChannelCustomEnum stateEnum : values()) {
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
