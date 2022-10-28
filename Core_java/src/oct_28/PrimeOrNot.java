//WAP to check the number is prime or not
package oct_28;
//import Scanner class
import java.util.Scanner;
//declare class
public class PrimeOrNot {

	//declare main method
	static void prime(int num) {
		boolean flag = false;
		//declare if_else
		if(num == 0 || num == 1) {
			System.out.println(num+" is not a prime number");
		}else {
			//declare for for loop
				for(int i = 2; i <= num/2; i++) {
					//declare if
					if(num % i == 0) {
						System.out.println(num + " is not a prime number");
						flag = true;
						break;
					}//end of if
				}
				//end of for loop
				//declare if_else
				if(flag == false) {
					System.out.println(num + " is a prime number");
				}
				//end if
		}//end of if_else
	}//end of method
	
	//declare main method
	public static void main(String arg[]) {
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to check prime or not");
		//taking input from user
		int num = sc.nextInt();
		prime(num);
	}
	//end of main method
}
//end of class
