package com.edu.po;

public class CourseVo implements Cloneable{
	private String cname;
	private String weekday;
	private String majorInfo;
	private String[] tnos;
	private String tname;
	private int pageSize;
	private int currentPage;
	private int f_jilu;
	private int l_jilu;
	
	
	public CourseVo(String cname, String weekday, String majorInfo,
			String[] tnos, int pageSize, int currentPage) {
		super();
		this.cname = cname;
		this.weekday = weekday;
		this.majorInfo = majorInfo;
		this.tnos = tnos;
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.f_jilu=(currentPage-1)*pageSize;
		this.l_jilu=this.f_jilu+pageSize;
	}
	
	public CourseVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
    public Object clone() {
        CourseVo obj = null;
        try {
            obj = (CourseVo) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return obj;
    }


	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public String getMajorInfo() {
		return majorInfo;
	}
	public void setMajorInfo(String majorInfo) {
		this.majorInfo = majorInfo;
	}
	public String[] getTnos() {
		return tnos;
	}
	public void setTnos(String[] tnos) {
		this.tnos = tnos;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public void setF_jilu() {
		this.f_jilu =(currentPage-1)*pageSize;
	}

	public void setL_jilu() {
		this.l_jilu = f_jilu+pageSize;
	}

	public int getF_jilu() {
		return f_jilu;
	}


	public int getL_jilu() {
		return l_jilu;
	}

	public void setL_jilu(int l_jilu) {
		this.l_jilu = l_jilu;
	}
	
	
}
