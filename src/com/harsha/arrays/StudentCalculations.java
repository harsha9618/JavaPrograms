package com.harsha.arrays;


public class StudentCalculations {

	int sum = 0;
	int count = 0;
	public int calculateStudentFee(Student[] stdd) {

		int sum = 0;
		for (int i = 0; i < stdd.length; i++) {
			sum = sum + stdd[i].getsFees();
		}
		return sum;
	}

	public int groupByDep(Student[] stdd) {
		for (int i = 0; i <= stdd.length - 1; i++) {
			if (stdd[i].getsGroup()=="Btech") {
				count = count + 1;
			}
		}
		return count;
	}

	int calculationCounts() {

		return sum / count;
	}
	
	//Student[] Array=null;
	/*
	 * public Student[] deleteStudent(Student[] stu1) {
	 * 
	 * 
	 * Student[] n_new = new Student[stu1.length - 1]; int j = 0; for (int i = 0; i
	 * < stu1.length ; i++) { if (stu1[i].getsName()== "Bhuvanesh") { continue;
	 * 
	 * } n_new[j++] = stu1[i]; //Array=n_new; } for(int i=0;i<n_new.length;i++) {
	 * System.out.println(n_new[i]); } return n_new; }
	 */
	
	
	  public Student[] addNewStudent(Student[] student) {
	  
	  Student newStudent = new Student(8, "Reddy", "MTech", 2, 28, 24500);
	  Student[] new_stu=new Student[student.length+1];
	  
	  
	  for(int i=0;i<student.length;i++) { new_stu[i]=student[i];
	  
	  }
	  
	  new_stu[new_stu.length-1]=newStudent; for(int i=0;i<new_stu.length;i++) {
	  System.out.println(new_stu[i]); } return new_stu;
	  
	  }
	 
	
	
	  public Student[] deleteStudent(int sid,Student[] stu1) {
			

			Student[] n_new = new Student[stu1.length - 1];
			
			Boolean flag=false;
			int j = 0;
			for (int i = 0; i < stu1.length ; i++) {
				if (stu1[i].getsId()==sid) {
					flag=true;
					continue;

				}
				if(stu1.length!=j+1) {
				n_new[j++] = stu1[i];
				}
				//Array=n_new;
			}
			if(flag) {
				return n_new;
			}
			else {
				return stu1;
			}
			
			
			//return n_new;
			
			/*for(int i=0;i<n_new.length;i++) {
				  System.out.println(n_new[i]);
				  }
		}*/
			

	  }
}