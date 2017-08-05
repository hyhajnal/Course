package com.edu.po;

public class Teacher {
    private String tno;

    private String tname;

    private String tsex;

    private Integer tage;

    private String tpsd;

    private String timg;

    private String majorinfo;

    private String pro;

    private String tinfo;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex == null ? null : tsex.trim();
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public String getTpsd() {
        return tpsd;
    }

    public void setTpsd(String tpsd) {
        this.tpsd = tpsd == null ? null : tpsd.trim();
    }

    public String getTimg() {
        return timg;
    }

    public void setTimg(String timg) {
        this.timg = timg == null ? null : timg.trim();
    }

    public String getMajorinfo() {
        return majorinfo;
    }

    public void setMajorinfo(String majorinfo) {
        this.majorinfo = majorinfo == null ? null : majorinfo.trim();
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro == null ? null : pro.trim();
    }

    public String getTinfo() {
        return tinfo;
    }

    public void setTinfo(String tinfo) {
        this.tinfo = tinfo == null ? null : tinfo.trim();
    }
}