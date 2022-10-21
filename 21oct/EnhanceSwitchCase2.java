
//import Scanner class
import java.util.Scanner;
//create a class
class EnhanceSwitchCase2{

	//method to choose the vegitable and fruits you want to buy
	static void printAbbr(String abbr){
		switch(abbr){
		case "c","c++","java","python",".net" -> System.out.println("Programming language");
		case "sql","oracle" -> System.out.println("Database language");
		case "html","php","javascript" -> System.out.println("Web language");
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
		System.out.println("Enter an language of any programming, web and database");
		stringAbbr = sc.next().toLowerCase();
		printAbbr(stringAbbr);
	}
	//ends of main method
}
//ends of class