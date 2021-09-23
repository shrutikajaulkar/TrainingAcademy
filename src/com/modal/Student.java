package com.modal;

public class Student {
	private int stdid;
	private String nm;
	private long mobile;
	private int batchid;
	public Student(String nm, long mobile, int batchid, int stdid) {
		super();
		this.stdid = stdid;
		this.nm = nm;
		this.mobile = mobile;
		this.batchid = batchid;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the stdid
	 */
	public int getStdid() {
		return stdid;
	}
	/**
	 * @param stdid the stdid to set
	 */
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	/**
	 * @return the nm
	 */
	public String getNm() {
		return nm;
	}
	/**
	 * @param nm the nm to set
	 */
	public void setNm(String nm) {
		this.nm = nm;
	}
	/**
	 * @return the mobile
	 */
	public long getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the batchid
	 */
	public int getBatchid() {
		return batchid;
	}
	/**
	 * @param batchid the batchid to set
	 */
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", nm=" + nm + ", mobile=" + mobile + ", batchid=" + batchid + "]";
	
}
}