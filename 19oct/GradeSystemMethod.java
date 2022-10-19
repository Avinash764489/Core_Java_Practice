//WAP in java to print the grades according to its percentage.
//importing Scanner class
import java.util.Scanner;
//create class
class GradeSystemMethod{

	//create method
	static void grades(){
		//Declearing variable
		int percentage, maths, science, english;
		char grade;

		//Taking input from user
		System.out.println("Enter your marks in Maths");
		maths = sc.nextInt();

		//Taking input from user
		System.out.println("Enter your marks in Science");
		science = sc.nextInt();

		//Taking input from user
		System.out.println("Enter your marks in English");
		english = sc.nextInt();

		//calculating over all percentage
		percentage = (maths+science+english)/3;
		System.out.println("Your over all percentage is :- "+percentage);
		System.out.println();

		//open if_else ladder
		if(percentege>=80)
			grade='O';
		else if(percentege>=75)
			grade='A';
		else if(percentege>=70)
			grade='B';
		else if(percentege>=60)
			grade='C';
		else if(percentege>=50)
			grade='D';
		else if(percentege>=40)
			grade='E';
		else
			grade='F';
		//close if_else ladder

		if(grade=='F')
			System.out.println("Fail" );
		else
			System.out.println("Grade is :- "+grade);
	}

	//create main class
	public static void main(String arg[]){
		//Create Scanner class object
		Scanner sc = new Scanner(System.in);


		grades();

	//ending of main method
	}
//ending of class	
}