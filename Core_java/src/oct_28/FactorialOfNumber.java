package oct_28;
//import Scanner class
import java.util.Scanner;
//declare class
public class FactorialOfNumber {


	//declare method
	static void factorial(int num) {
		int fact = 1;
		//declare for outer loop
				for(int i = 1; i <= num; i++) {
					fact = i*fact;
				}
				//end of outer loop
				System.out.println("Factorial of "+num+" is "+fact);
	}
	
	//declare main method
	public static void main(String arg[]) {
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to find its factorial");
		//taking input from user
		int num = sc.nextInt();
		factorial(num);
	}
	//end of main method
}
//end of class
