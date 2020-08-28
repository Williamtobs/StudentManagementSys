package StudentManagementSys;

public class Student {
	int no_student=5;
	String student_name;
	int Year;
	int grade_level=9;
	static int noOfstudents=0;
	int no_course;
	int StudentBalance=5000;
	int course_fee=600;
	
	private String unique_id = String.valueOf(grade_level);
	
	Student(String first_name, String sec_name, int year) {
		while (noOfstudents <= no_student) {
			String name=first_name+" "+sec_name;
			this.student_name=name;
			this.Year=year;
			noOfstudents++;
			unique_id+=noOfstudents;
			unique_id();
			System.out.println(student_name +" "+Year);
			break;
		}
	}
	
	void PayTution(int amount) {
		System.out.println("Student successfully pay "+ amount +" for tution");
		StudentBalance-=amount;
	}
	void getCourseFees() {
		StudentBalance-=course_fee*no_course;
		System.out.println("Total Courses fee is "+ course_fee*no_course);
	}
	void unique_id() {
		for (int i = 0; i<=2; i++) {
			int j=(int)(9*Math.random());
			unique_id += String.valueOf(j);
		}
	}
	
	void getUnique_id() {
		System.out.println("Student ID is " + unique_id);
	}
	
}
