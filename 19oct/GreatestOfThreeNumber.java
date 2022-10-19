// WAP in java to print Gratest of three number
//importing Scanner class
import java.util.Scanner;
//create class
class StudentPercentage{
	//create main class
	public static void main(String arg[]){
		//Create Scanner class object
		Scanner sc = new Scanner(System.in);


		//Declearing variable
		int num1, num2, num3;

		//Taking input from user
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter Second number");
		num2 = sc.nextInt();
		System.out.println("Enter third number");
		num3 = sc.nextInt();

		//open if_else
		if(num1>num2 || num1>num3)
			System.out.println("Greatest number is :- "+num1);
		else if(num2>num3)
			System.out.println("Greatest number is :- "+num2);
		else
			System.out.println("Greatest number is :- "+num3);
		//close if_else

	//ending of main method
	}
//ending of class	
}