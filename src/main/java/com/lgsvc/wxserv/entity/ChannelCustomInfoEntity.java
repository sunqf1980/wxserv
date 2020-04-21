package com.lgsvc.wxserv.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 设备客户实体类
 *
 * @author sunqf1980@163.com
 */
@Getter
@Setter
@ToString
public class ChannelCustomInfoEntity {
    private String channel_id;
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
    private String cur_id;
    private String chx;
    private Double val;
    private Integer state_cur;
}
