package com.liuge.wxserv.enums;

public enum UserLongStateEnum {
    SUCCESS(0, "创建成功"), INNER_ERROR(-1001, "操作失败"), EMPTY(-1002, "用户信息为空");

    private int state;
    private String stateInfo;

    private UserLongStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static UserLongStateEnum stateOf(int index) {
        for (UserLongStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
