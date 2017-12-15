package com.primary.beans;

public class School {

	private String sname;
	private String saddress;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "School [sname=" + sname + ", saddress=" + saddress + "]";
	}
}
