package com.edu.po;

public class Major {
    private String majornum;

    private String majorname;

    private String majorteh;

    private String dept;

    private String deptteh;

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum == null ? null : majornum.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getMajorteh() {
        return majorteh;
    }

    public void setMajorteh(String majorteh) {
        this.majorteh = majorteh == null ? null : majorteh.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getDeptteh() {
        return deptteh;
    }

    public void setDeptteh(String deptteh) {
        this.deptteh = deptteh == null ? null : deptteh.trim();
    }
}