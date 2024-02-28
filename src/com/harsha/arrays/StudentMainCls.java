package com.harsha.arrays;


public class StudentMainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Harsha", "M.B.A", 2, 27, 25500);
		Student s2 = new Student(2, "Bhuvanesh", "Btech", 4, 25, 35000);
		Student s3 = new Student(3, "Sheeraj", "Btech", 3, 22, 42500);
		Student s4 = new Student(4, "Viswa", "Degree", 1, 25, 75500);
		Student s5 = new Student(5, "Dinesh", "Btech", 2, 27, 29500);

		Student[] stu = new Student[5];
		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;
		stu[3] = s4;
		stu[4] = s5;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("*********************");
		StudentCalculations SS = new StudentCalculations();
		System.out.println(SS.calculateStudentFee(stu));
		System.out.println(SS.groupByDep(stu));
		
		/*
		 * SS.deleteStudent(stu); for (int i = 0; i <(SS.Array).length;i++) {
		 * System.out.println(SS.Array[i]); }
		 */
		System.out.println("*****After Deleting a student record*****");
		
		stu=SS.deleteStudent(3,stu);	
		
		System.out.println("*****After adding a new student record*****");
		stu=SS.addNewStudent(stu);	 
	        

	        
	

		
	}

}
