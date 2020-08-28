package StudentManagementSys; 
import java.util.Scanner;


public class Grade11 {
	public static void main(String[] args) {
		System.out.println("Enter student First name, Second name, and Academy year ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Student student1 = new Student(in.next(), in.next(), in.nextInt());
		student1.getUnique_id();
		System.out.println("Number of course to register? ");
		student1.no_course=in.nextInt();
		System.out.println("Insert Course name");
		String student1Course="";
		for (int i=0; i < student1.no_course; i++) {
			String course=in.next()+("\n");
			student1Course+=course;
		}
		System.out.println("Course(s) Student register for are: \n" +student1Course);
		student1.getCourseFees();
		while(true) {
			System.out.println("(1) Check Student Balance\t(2) Pay Tution\n(3) Exit");
			String option = in.next();
			if (option.equals("1")) {
				System.out.println("Student Balance is "+student1.StudentBalance);
	
			}
			else if (option.equals("2")) {
				System.out.println("Input amount to pay");
				student1.PayTution(in.nextInt());
				
			}
			else if (option.equals("3")) {
				System.out.println(" ");
				System.out.println("Student Status");
				System.out.println(student1.student_name+" "+"\n"
						+ student1Course+""+"Student balance is "+student1.StudentBalance);
				student1.getUnique_id();
				System.exit(0);
				
			}
			else {
				System.out.println("Input valid option");
			}
		}
		
		//Student student2 = new Student("Akeem", "Tobi", 2020);
		//System.out.println(student2.getUnique_id());
	}
}
