package com.modal;

public class Trainer {
	private int trainerid;
	private String name;
	private long mobile;
	public Trainer(int trainerid, String name, long mobile) {
		super();
		this.trainerid = trainerid;
		this.name = name;
		this.mobile = mobile;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Trainer [trainerid=" + trainerid + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	

}
