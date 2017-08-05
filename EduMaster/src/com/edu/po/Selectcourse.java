package com.edu.po;

public class Selectcourse {
    private Integer scnum;

    private Integer cno;

    private String sno;

    private Float score;

    private Integer ishave;

    public Integer getScnum() {
        return scnum;
    }

    public void setScnum(Integer scnum) {
        this.scnum = scnum;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getIshave() {
        return ishave;
    }

    public void setIshave(Integer ishave) {
        this.ishave = ishave;
    }
}