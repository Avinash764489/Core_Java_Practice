//importing Scanner class
import java.util.Scanner;
//create class
class CheckBloodDonation{
	//create main class
	public static void main(String arg[]){
		//Create Scanner class object
		Scanner sc = new Scanner(System.in);

		//declaring variables
		int age;
		char gender;
		float weight;

		//Taking input from user
		System.out.println("Enter your age");
		age = sc.nextInt();
		


		if(age>=18){

			System.out.println("Enter your gender(f/m)");
			gender = sc.next().charAt(0);
			System.out.println("Enter your weight");
			weight = sc.nextFloat();
			if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
				System.out.println("You can donet your blood");
			else
				System.out.println("You cannot donet the blood.... Better luck next time");
		}else 
			System.out.println("You are too young to donate blood... Better luck next time");

		
	//ending of main method
	}
//ending of class	
}