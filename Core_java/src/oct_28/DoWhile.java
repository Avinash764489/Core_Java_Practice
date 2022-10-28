//WAP to make a calculator
package oct_28;
//import Scanner class
import java.util.Scanner;
//create a class
public class DoWhile {
	
	static void choicess(float num1, float num2, int choice){
		switch(choice){
		case 1:add(num1, num2);
			break;
		case 2:sub(num1, num2);
			break;
		case 3:mult(num1, num2);
			break;
		case 4:div(num1, num2);
			break;
		case 5:System.exit(0);
			break;
		default: System.out.println("Wrong input");
		}
	}

	static void add(float num1, float num2){
		System.out.println("The result is :- "+(num1+num2));
	}

	static void sub(float num1, float num2){
		System.out.println("The result is :- "+(num1-num2));
	}

	static void mult(float num1, float num2){
		System.out.println("The result is :- "+(num1*num2));
	}

	static void div(float num1, float num2){
		System.out.println("The result is :- "+(num1/num2));
	}

	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//Declaring variable
		int choice;
		float num1, num2;
		boolean ch = true;
		do {
			
		//taking 2 numbers from user
		System.out.println("Enter your first number");
		num1 = sc.nextFloat();
		System.out.println("Enter your second number");
		num2 = sc.nextFloat();


		System.out.println("Press the key according to your choicess");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		System.out.println("Enter your choicess");
		choice = sc.nextInt();
		choicess(num1,num2,choice);
		
		System.out.println("Do you want to enter more (true/false)");
		ch = sc.nextBoolean();
		}while(ch);
	}
		
}