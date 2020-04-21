package com.lgsvc.wxserv.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 *  cw_channel设备管理-表的实体类
 *
 * @author sunqf1980@163.com
 */
@Getter
@Setter
@ToString
public class CwChannel {
    private String id;
    private Date inTime;
    private Integer flag;
    private Integer customerId;
    private String sortstr;
    private Integer sortint;
    private String descript;
    private String devname;
    private String devaddr;
    private Integer sortid;
    private Integer gatherway;
    private Integer comnum;
    private Double sv;
    private Double lowvalue;
    private Double highvalue;
    private Double l2;
    private Double h2;
    private Integer use2;
    private Double xa;
    private Double xb;
    private Integer state;
    private String agroup;
    private Integer delayl;
    private Integer delayh;
    private Integer dlsms;
    private Integer dhsms;
    private Integer dlemail;
    private Integer dhemail;
    private Integer dlphone;
    private Integer dhphone;
    private Integer dlwx;
    private Integer dhwx;
    private Integer d2l;
    private Integer d2h;
    private Integer d2lsms;
    private Integer d2hsms;
    private Integer d2lemail;
    private Integer d2hemail;
    private Integer d2lphone;
    private Integer d2hphone;
    private Integer d2lwx;
    private Integer d2hwx;
    private Integer gdelay;
    private Integer gmaxerr;
    private String simno;
    private String ip;
    private String ncode;
    private Integer flag1;
    private Integer flag2;
    private Integer flag3;
    private String bz;
    private String sm;

}
