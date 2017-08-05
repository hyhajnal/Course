package com.edu.po;

public class Admin {
    private String anum;

    private String aname;

    private String apsd;

    public String getAnum() {
        return anum;
    }

    public void setAnum(String anum) {
        this.anum = anum == null ? null : anum.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApsd() {
        return apsd;
    }

    public void setApsd(String apsd) {
        this.apsd = apsd == null ? null : apsd.trim();
    }
}