package com.lgsvc.wxserv.entity;

public class TbSysResourceEntity {
    private String sys_name;
    private String sys_info;
    private String sys_stat;
    private String task_id;
    private String task_flags;
    private String cron;
    private String path;
    private String bin_path;
    private String image_path;
    private String resource_path;
    private String task_file;
    private String file;

    public String getSys_name() {
        return sys_name;
    }

    public void setSys_name(String sys_name) {
        this.sys_name = sys_name;
    }

    public String getSys_info() {
        return sys_info;
    }

    public void setSys_info(String sys_info) {
        this.sys_info = sys_info;
    }

    public String getSys_stat() {
        return sys_stat;
    }

    public void setSys_stat(String sys_stat) {
        this.sys_stat = sys_stat;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getTask_flags() {
        return task_flags;
    }

    public void setTask_flags(String task_flags) {
        this.task_flags = task_flags;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getBin_path() {
        return bin_path;
    }

    public void setBin_path(String bin_path) {
        this.bin_path = bin_path;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getResource_path() {
        return resource_path;
    }

    public void setResource_path(String resource_path) {
        this.resource_path = resource_path;
    }

    public String getTask_file() {
        return task_file;
    }

    public void setTask_file(String task_file) {
        this.task_file = task_file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "TbSysResourceEntity{" +
                "sys_name='" + sys_name + '\'' +
                ", sys_info='" + sys_info + '\'' +
                ", sys_stat='" + sys_stat + '\'' +
                ", task_id='" + task_id + '\'' +
                ", task_flags='" + task_flags + '\'' +
                ", cron='" + cron + '\'' +
                ", path='" + path + '\'' +
                ", bin_path='" + bin_path + '\'' +
                ", image_path='" + image_path + '\'' +
                ", resource_path='" + resource_path + '\'' +
                ", task_file='" + task_file + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
