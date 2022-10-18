import java.util.Scanner;
class Voting{
	public static void main(String arg[]){
		//create Scanner class object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age");
		//taking input from user
		int num1 = sc.nextInt();
		if(num1<0){
			System.out.println("Please enter positive value");
		}else if(num1>=18){
			System.out.println("You are eligible for voting");
			System.out.println("You may proceed ...... ");
		}else{
			System.out.println("Your age is less then 18 you are not eligible for voting");
		}
	}
}