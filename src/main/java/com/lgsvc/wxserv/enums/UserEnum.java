package com.lgsvc.wxserv.enums;

public enum UserEnum {
    SUCCESS(0, "操作成功"), PASS(1, "通过认证"),
    CHECK(-1, "检查中"), OFFLINE(-2, "离线中"),
    INNER_ERROR(-1001, "内部系统错误"),
    NULL_CUSTOMID(-1003, "客户号为空"),
    NULL_DATA(-1004,"此客户未注册,请先注册"),
    NULL_RECOURCE(-1005,"未找到此资源"),
    NULL_PARAMS(-1006,"参数有误,请检查用户名或密码"),
    ERR_PASSWD(-1007,"密码错误"),
    NULL_HAX(-2006,"通道号为空");

    private int state;
    private String stateInfo;

    private UserEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 依据传入的state返回相应的enum值
     */
    public static UserEnum stateOf(int state) {
        for (UserEnum stateEnum : values()) {
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
