//WAP to print Day
//import Scanner class
import java.util.Scanner;
clas SwitchCaseDay{
	static void day(int num){
		switch(num){
		case 1:System.out.println("Monday");
			break;
		case 2:System.out.println("Tuesday");
			break;
		case 3:System.out.println("Wednesday");
			break;
		case 3:System.out.println("Thursday");
			break;
		case 4:System.out.println("Friday");
			break;
		case 5:System.out.println("Saturday");
			break;
		case 6:System.out.println("Sunday");
			break;
		default: System.out.println("Wrong input");
		}
	}
	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day in number")
		int num1 = sc.nextInt();

		day(num1)
	}
}
