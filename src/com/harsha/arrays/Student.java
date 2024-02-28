package com.harsha.arrays;

public class Student {

	private int sId;
	private String sName;
	private String sGroup;
	private int sYear;
	private int sAge;
	private int sFees;

	
	public int getsId() {
		return sId;
	}

	

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sname) {
		this.sName = sname;
	}

	public String getsGroup() {
		return sGroup;
	}

	public void setsGroup(String sGroup) {
		this.sGroup = sGroup;
	}

	public int getsYear() {
		return sYear;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public int getsFees() {
		return sFees;
	}

	public void setsFees(int sFees) {
		this.sFees = sFees;
	}
	public Student(int sId, String sname, String sGroup, int sYear, int sAge, int sFees) {
		super();
		this.sId = sId;
		this.sName = sname;
		this.sGroup = sGroup;
		this.sYear = sYear;
		this.sAge = sAge;
		this.sFees = sFees;
	}



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sGroup=" + sGroup + ", sYear=" + sYear + ", sAge=" + sAge
				+ ", sFees=" + sFees + "]";
	}
	



}
