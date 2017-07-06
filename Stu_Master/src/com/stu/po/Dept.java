package com.stu.po;

public class Dept {
    private String did;

    private String academy;

    private String dname;

    private Integer dtel;

    private String dteacher;

    private String dinfo;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did == null ? null : did.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public Integer getDtel() {
        return dtel;
    }

    public void setDtel(Integer dtel) {
        this.dtel = dtel;
    }

    public String getDteacher() {
        return dteacher;
    }

    public void setDteacher(String dteacher) {
        this.dteacher = dteacher == null ? null : dteacher.trim();
    }

    public String getDinfo() {
        return dinfo;
    }

    public void setDinfo(String dinfo) {
        this.dinfo = dinfo == null ? null : dinfo.trim();
    }
}