package com.lgsvc.wxserv.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 *  cw_tempcurr实时温湿度-表的实体类
 *
 * @author sunqf1980@163.com
 */
@Getter
@Setter
@ToString
public class CwTempCurr {
    private String id;
    private Date inTime;
    private Integer flag;
    private Integer customerId;
    private String chx;
    private Double curVal;
    private Integer state;
}
