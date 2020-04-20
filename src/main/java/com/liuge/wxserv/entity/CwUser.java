package com.liuge.wxserv.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CwUser {
    private String id;
    private Date inTime;
    private Integer flag;
    private Integer customerId;
    private String uId;
    private String upWd;
    private String uName;
    private String uPhone;
    private String uEmail;
    private String uWatch;
    private String uExplain;
    private String uMemo;
    private String canDo;

}
