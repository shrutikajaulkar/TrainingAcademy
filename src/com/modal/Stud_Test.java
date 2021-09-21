package com.modal;

public class Stud_Test {
	private int stdid;
	private int testid;
	private int testmarks;
	public Stud_Test(int stdid, int testid, int testmarks) {
		super();
		this.stdid = stdid;
		this.testid = testid;
		this.testmarks = testmarks;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public int getTestmarks() {
		return testmarks;
	}
	public void setTestmarks(int testmarks) {
		this.testmarks = testmarks;
	}
	@Override
	public String toString() {
		return "Stud_Test [stdid=" + stdid + ", testid=" + testid + ", testmarks=" + testmarks + "]";
	}
	

}
