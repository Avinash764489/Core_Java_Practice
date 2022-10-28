package oct_28;
//import Scanner class
import java.util.Scanner;
//declare class
public class EvenNumbers {

	//declare method
	static void loop(int num) {
		//declare for loop
		for(int i=1; i<num; i++) {
			//declare if_else
			if(i%2==0)
				System.out.println("Even no. is :- "+i);
			else
				System.out.println("Odd number is :- "+i);
			//ends of if_else
		}
		//ends of for loop
	}
	//end of method
	//declare method
	public static void main(String arg[]) {
		//declare variable
		int num;
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to check from 1 to n");
		//taking input from user
		num = sc.nextInt();
		//calling method
		loop(num);
	}

}
