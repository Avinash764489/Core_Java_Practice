//WAP in java to show the student is pass of fail according to its over all percentage.
//importing Scanner class
import java.util.Scanner;
//create class
class StudentPercentage{
	//create main class
	public static void main(String arg[]){
		//Create Scanner class object
		Scanner sc = new Scanner(System.in);

		//Taking input from user
		System.out.println("Enter your marks in Maths");
		int maths = sc.nextInt();

		//Taking input from user
		System.out.println("Enter your marks in Science");
		int science = sc.nextInt();

		//Taking input from user
		System.out.println("Enter your marks in English");
		int english = sc.nextInt();

		//calculating over all percentage
		int sum = (maths+science+english)/3;

		//Using if_else condition to check student is pass or fail
		if(sum>=40){

			//print if student is pass
			System.out.println("Your over all percentage is :- "+sum);
			System.out.println("Congratulation you are pass");
		}else{

			//print if student is fail
			System.out.println("Your over all percentage is :- "+sum);
			System.out.println("Sorry You are fail");

		//ending of if_else	
		}
	//ending of main method
	}
//ending of class	
}