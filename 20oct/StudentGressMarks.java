//WAP in java to print the gress marks.
//importing Scanner class
import java.util.Scanner;
//create class
class StudentGressMarks{

	//create method
	static void grades(){


		//Create Scanner class object
		Scanner sc = new Scanner(System.in);


		//Declearing variable
		float marks;

		//Taking input from user
		System.out.println("Enter your marks");
		marks = sc.nextFloat();


		//open if_else ladder
		if(marks>=35 || marks<=37)
			marks +=5;
		else if(marks>=38 || marks<=39)
			marks +=2;
		else if(marks<35)
			System.out.println("You are Fail....")
		//close if_else ladder

		//print new marks
		System.out.println("Your marks is :- "+marks);
	}

	//create main class
	public static void main(String arg[]){
		


		grades();

	//ending of main method
	}
//ending of class	
}