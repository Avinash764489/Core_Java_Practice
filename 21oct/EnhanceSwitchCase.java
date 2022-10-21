
//import Scanner class
import java.util.Scanner;
//create a class
class EnhanceSwitchCase{

	//method to choose the vegitable and fruits you want to buy
	static void printAbbr(String abbr){
		switch(abbr){
		case "lol" -> System.out.println("Lots of laugh");
		case "asap" -> System.out.println("As soon as possible");
		case "ttyl" -> System.out.println("Talk to you later");
		default-> System.out.println("Wrong input");
		}
	}
	//ends of 

	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//declearing variable
		String stringAbbr;

		//taking input from user choice and quentity he or she want to buy
		System.out.println("Enter an abbrevition (lol, asap, ttyl)");
		stringAbbr = sc.next().toLowerCase();
		printAbbr(stringAbbr);
	}
	//ends of main method
}
//ends of class