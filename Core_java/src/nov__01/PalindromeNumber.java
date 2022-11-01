//WAP to check number is palindrome or not

package nov__01;

//import Scanner class
import java.util.Scanner;

//declare class
public class PalindromeNumber {
	
	//declare method
	static void palindrome(int num) {
		
		//declare variable
		int reverse = 0;  //to store reverse number
		int remainder;  //to store remainder
		int count = num;//copy of original number
		
		//while loop to calculating reverse number
		while(num > 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		//end of while loop
		
		//if_else to compare original number and reversed number
		if(reverse == count) {
			System.out.println(count+" is a palindrome");
		}else {
			System.out.println(count+" is not a palindrome");
		}
	}
	//end of method
	
	//main method
	public static void main(String arg[]) {
		
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//declare variable
		int num ;
		System.out.println("Enter a number");
		
		//taking input from user
		num = sc.nextInt();
		
		//calling method
		palindrome(num);
	}
	//end main method
}
//end class
