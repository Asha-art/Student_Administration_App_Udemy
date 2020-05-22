package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	//private int id;
	private int gradeYear;
	private String courses = " ";
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
		
		System.out.println("1. Freshman\n2. Sophomore\n3.Junior\n4.Sophomore\nEnter the student grade level 1 ,2, 3 or 4");
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
		System.out.print("Enter course to enroll (Q to Quit): ");
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
	//	System.out.println("Enrolled in: "+ courses);
		
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is : $"+ tuitionBalance);
	}
	
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $ "+payment);
		viewBalance();
	}
	//show status
	
	public String toString() {
		return "\nName: " +firstName + " "+lastName + 
				"\nGrade Level: "+ gradeYear+
				"\nStudent ID: "+studentId+
				"\nCourses Enrolled:  "+courses +
				"\nBalance: $"+tuitionBalance;
	}
	

}
