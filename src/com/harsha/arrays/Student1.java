package com.harsha.arrays;

public class Student1 {
	int sum = 0;
	int count = 0;
	private int sId;
	private String sName;
	private String sGroup;
	private int sYear;
	private int sAge;
	private int sFees;
	private int sMaths;
	private int sScience;
	private int sSocial;

	public Student1(int sId, String sName, String sGroup, int sYear, int sAge, int sFees, int sMaths, int sScience,
			int sSocial) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sGroup = sGroup;
		this.sYear = sYear;
		this.sAge = sAge;
		this.sFees = sFees;
		this.sMaths = sMaths;
		this.sScience = sScience;
		this.sSocial = sSocial;
	}

	public int getsMaths() {
		return sMaths;
	}

	public void setsMaths(int sMaths) {
		this.sMaths = sMaths;
	}

	public int getsScience() {
		return sScience;
	}

	public void setsScience(int sScience) {
		this.sScience = sScience;
	}

	public int getsSocial() {
		return sSocial;
	}

	public void setsSocial(int sSocial) {
		this.sSocial = sSocial;
	}

	@Override
	public String toString() {
		return "Student1 [sId=" + sId + ", sName=" + sName + ", sGroup=" + sGroup + ", sYear=" + sYear + ", sAge="
				+ sAge + ", sFees=" + sFees + ", sMaths=" + sMaths + ", sScience=" + sScience + ", sSocial=" + sSocial
				+ "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
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

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(9, " Harsha", "M.B.A", 2, 27, 25500, 88, 98, 67);
		Student1 s2 = new Student1(2, " Bhuvanesh", "Btech", 4, 25, 35000, 67, 87, 76);
		Student1 s3 = new Student1(3, " Sheeraj", "Btech", 3, 22, 42500, 78, 65, 89);
		Student1 s4 = new Student1(8, " Viswa", "Degree", 1, 25, 75500, 88, 79, 75);
		Student1 s5 = new Student1(5, " Dinesh", "Mcom", 2, 27, 29500, 65, 78, 98);

		Student1[] student = new Student1[5];
		student[0] = s1;
		student[0] = s2;
		student[0] = s3;
		student[0] = s4;
		student[0] = s5;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		

		
		

	}

	public int calculateStudentFee(Student[] stdd) {

		int sum = 0;
		for (int i = 0; i < stdd.length; i++) {
			sum = sum + stdd[i].getsFees();

		}
		return sum;

	}

	public int groupByDep(Student[] stdd) {
		for (int i = 0; i <= stdd.length - 1; i++) {
			if (stdd[i].getsGroup() == "M.B.A") {
				count = count + 1;

			}

		}
		return count;
	}

	int calculationCounts(Student[] std) {

		return sum / count;
	}

}
