package com.edu.po;

public class Student {
    private String sno;

    private String ssex;

    private String sname;

    private String spsd;

    private String majornum;

    private Integer sgrade;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSpsd() {
        return spsd;
    }

    public void setSpsd(String spsd) {
        this.spsd = spsd == null ? null : spsd.trim();
    }

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum == null ? null : majornum.trim();
    }

    public Integer getSgrade() {
        return sgrade;
    }

    public void setSgrade(Integer sgrade) {
        this.sgrade = sgrade;
    }
}