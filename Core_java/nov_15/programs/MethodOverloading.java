package programs;

//importing Scanner class
import java.util.Scanner;

//declare class
public class MethodOverloading {

	//declare method
	public static void display(float num1) {
		System.out.println("The number is : "+num1);
	}
	//end of method
	
	//declare method
	public static void display(float num1, float num2) {
		System.out.println("Sum of two number is : "+(num1+num2));
	}
	//end of method
	
	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		float num1, num2;
		
		//create scanner class object
		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter first number");
		num1 = sc.nextFloat();
		System.out.println("Enter second number");
		num2 = sc.nextFloat();
		
		//calling method
		display(num1);
		display(num1, num2);
	}
	//end of method
}
//end of class
