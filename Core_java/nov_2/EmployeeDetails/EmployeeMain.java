package EmployeeDetails;
//import Scanner class
import java.util.Scanner;

public class EmployeeMain {

//main method
	public static void main(String[] args) {

		// creating an object of EmployeeInfo
		EmployeeInfo info = new EmployeeInfo();

		// creating Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//instance variables
		int empID;
		String empName;
		double salary;
		String department;
		int temp;
		float hike;
		
		//taking input from user
		System.out.println("Enter Employee details ......");
		System.out.println("Enter Employee id");
		empID = sc.nextInt();
		System.out.println("Enter Employee name");
		empName = sc.next();
		System.out.println("Enter Employee salary");
		salary = sc.nextDouble();
		System.out.println("Enter Employee department");
		department = sc.next();
		
		
		info.enterDetails(empID, empName, salary, department);
		System.out.println("You want to "+empName+" salary hike (yes - 1 / no - 0");
		temp = sc.nextInt();
		
		//hike the salary
		if(temp == 1) {
			System.out.println("Enter the percent you want to hike ");
			
			//calling hikeSalary method of EmployeeInfo
			hike = sc.nextFloat();
			info.hikeSalary(hike);
		}else
			//calling hikeSalary method of EmployeeInfo
			info.hikeSalary();
		//calling printDetails method of EmployeeInfo to print Employee details
		info.printDetails();
	}
	// main ends

}
//class ends