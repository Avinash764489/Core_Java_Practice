package EmployeeDetails;
// declaring class
public class EmployeeInfo {

	// instance variables
	private int empID;
	private String empName;
	private double salary;
	private String department;
	private float hike = 5.0f;

	// method to enter Employee details
	void enterDetails(int id, String name, double sal, String dept) {
		empID = id;
		empName = name;
		salary = sal;
		department = dept;

	}
	//end of method

	// method to hike salary
	void hikeSalary() {
		salary += (salary*hike/100);
		
	}
	//end of method
	//parameterized method to hike salary
	void hikeSalary(float hike) {
		salary += (salary*hike/100);
		
	}
	//end of method
	
	// method to print Employee details
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee details .......");
		System.out.println("Employee ID:" + empID);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Salary :" + salary);
		System.out.println("Employee department :" + department);
	}//end of method


}
//end of class

