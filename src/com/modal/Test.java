package com.modal;

public class Test {
	private int testid;
	private String testname;
	private int testmarks;
	
	public Test(int testid, String testname, int testmarks) {
		super();
		this.testid = testid;
		this.testname = testname;
		this.testmarks = testmarks;
	}
	public int getTestmarks() {
		return testmarks;
	}
	public void setTestmarks(int testmarks) {
		this.testmarks = testmarks;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	@Override
	public String toString() {
		return "Test [testid=" + testid + ", testname=" + testname + ", testmarks=" + testmarks + "]";
	}
	
	
	
	

}
