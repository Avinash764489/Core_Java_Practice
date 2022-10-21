
//import Scanner class
import java.util.Scanner;
//create a class
class EnhanceSwitchCase2{

	//start method
	static void noOfDays(String input){
		switch(input){
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december": System.out.println("No of days in "+input+ " are 31 days");
			break;

		case "april":
		case "june":
		case "september":
		case "november": System.out.println("No of days in "+input+ " are 30 days");
			break;

		case "february": System.out.println("Enter the year:");
			int year = sc.nextInt();

			//check leap year
			if(((year%4 == 0) && (year%100 != 0))||(year%400 == 0))
				System.out.println("No of days in "+input+ " are 29 days")
			else
				System.out.println("No of days in "+input+ " are 28 days");
			break;

		default-> System.out.println("Month not exists....");
		}
	}
	//ends of method

	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//declearing variable
		String input;

		//taking input from user choice and quentity he or she want to buy
		System.out.println("Enter any month");
		input = sc.next().toLowerCase();
		noOfDays(input);
	}
	//ends of main method
}
//ends of class