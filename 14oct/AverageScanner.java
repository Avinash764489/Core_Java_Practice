//WAP in java to to find the average of three number using command line argument.
//import Scanner class
import java.util.Scanner;
class AverageScanner{
	public static void main(String arg[]){
		//create object of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		Float num1 = sc.nextFloat();
		System.out.println("Enter second number");
		Float num2 = sc.nextFloat();
		System.out.println("Enter third number");
		Float num3 = sc.nextFloat();
		Float average = (num1+num2+num3)/3;//average of three number
		System.out.println("Average of three number :- "+average);
	}
}