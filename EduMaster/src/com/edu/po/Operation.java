package com.edu.po;

public class Operation {
    private String ifopcourse;

    private String ifopgrade;

    public String getIfopcourse() {
        return ifopcourse;
    }

    public void setIfopcourse(String ifopcourse) {
        this.ifopcourse = ifopcourse == null ? null : ifopcourse.trim();
    }

    public String getIfopgrade() {
        return ifopgrade;
    }

    public void setIfopgrade(String ifopgrade) {
        this.ifopgrade = ifopgrade == null ? null : ifopgrade.trim();
    }
}