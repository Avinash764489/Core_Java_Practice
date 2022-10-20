//WAP to check student is qualify for exam or not
//import Scanner class
import java.util.Scanner;
//create a class
class CheckQualifyForExam{

	static void check(int num1, int num2){
		float percent = (num2*100)/num1;
		System.out.println("Your attendence percentage is :- "+percent+"%");
		if(percent >= 75)
			System.out.println("Congratulations.... You are qualify for exam");
		else
			System.out.println("Sorry You are not qualify for exam");
	}

	
	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//declearing variable
		int num1, num2;

		//taking 2 numbers from user
		System.out.println("Enter Total no of classes");
		num1 = sc.nextInt();
		System.out.println("Enter number of classes you addend");
		num2 = sc.nextInt();


		check(num1,num2);
	}
}