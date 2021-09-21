package com.modal;

public class Batch {
private int batchid;
private String name;
private int trainerid;
public Batch(int batchid, String name, int trainerid) {
	super();
	this.batchid = batchid;
	this.name = name;
	this.trainerid = trainerid;
}
public int getBatchid() {
	return batchid;
}
public void setBatchid(int batchid) {
	this.batchid = batchid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTrainerid() {
	return trainerid;
}
public void setTrainerid(int trainerid) {
	this.trainerid = trainerid;
}
@Override
public String toString() {
	return "Batch [batchid=" + batchid + ", name=" + name + ", trainerid=" + trainerid + "]";
}


	
}

