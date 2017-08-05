package com.edu.po;

public class Course {
    private Integer cno;

    private String cname;

    private String majorinfo;

    private Float credit;

    private Integer clong;

    private String cadd;

    private String weekday;

    private String ctime;

    private String tno;

    private String cimg;

    private String cinfo;

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getMajorinfo() {
        return majorinfo;
    }

    public void setMajorinfo(String majorinfo) {
        this.majorinfo = majorinfo == null ? null : majorinfo.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public Integer getClong() {
        return clong;
    }

    public void setClong(Integer clong) {
        this.clong = clong;
    }

    public String getCadd() {
        return cadd;
    }

    public void setCadd(String cadd) {
        this.cadd = cadd == null ? null : cadd.trim();
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday == null ? null : weekday.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg == null ? null : cimg.trim();
    }

    public String getCinfo() {
        return cinfo;
    }

    public void setCinfo(String cinfo) {
        this.cinfo = cinfo == null ? null : cinfo.trim();
    }
}