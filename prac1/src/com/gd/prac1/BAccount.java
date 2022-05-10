package com.gd.prac1;

public class BAccount implements Comparable<BAccount> {
	private String aco;
	private String name;
	private String fname;
	private String mname;
	private String atype;
	private int mbalance=500;
//	public BAccount(String aco, String name, String fname, String mname, String atype, int mbalance) {
//		this.aco = aco;
//		this.name = name;
//		this.fname = fname;
//		this.mname = mname;
//		this.atype = atype;
//		this.mbalance = mbalance;
//	}
	@Override
	public String toString() {
		return "BAccount [aco=" + aco + ", name=" + name + ", fname=" + fname + ", mname=" + mname + ", atype=" + atype
				+ ", mbalance=" + mbalance + "]";
	}
	public String getAco() {
		return aco;
	}
	public void setAco(String aco) {
		this.aco = aco;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public int getMbalance() {
		return mbalance;
	}
	public void setMbalance(int mbalance) {
		this.mbalance = mbalance;
	}
	@Override
	public int compareTo(BAccount o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
