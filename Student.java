package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	//private int id;
	private int gradeYear;
	private String courses = null;
	private String studentId;//unique student id
	//private int balance;
	private int tuitionBalance=0;
	private static int cost =600;
	private static int id =1000; //this is id for the class and not specific to only object because its static
	
		
	public Student(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1. Freshman\n2. Sophomore\n 3.Junior\n 4.Sophomore\nEnter the student grade level 1 ,2,3,or 4");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		//System.out.println(firstName +" "+ lastName +" "+ gradeYear+" "+studentId);
		
		
	}
	//Generate an Id
		private void setStudentId() {
			// grade level + ID
			id++;
			this.studentId =  gradeYear+ " "+ id;
		}
			
	//enroll in courses
	public void enroll() {
	
		do {
		System.out.println("Enter course to enroll (Q to Quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equalsIgnoreCase("Q")) {
			courses = courses +"\n "+ course;	
			tuitionBalance = tuitionBalance + cost;
			
		}else
			{
			break;
			}
		}while(1!=0);
		System.out.println("Enrolled in: "+ courses+"\n"+ "Tuition Balance: "+ tuitionBalance);
		
	}
	
	//View balance
	
	//pay tuition
	
	//show status
	

}
