package programs;

//import Scanner class
import java.util.Scanner;

//declare class
public class SimpleInterest {
	
	//declare interest method for calculating simple interest 
	public static void interest(float p, float r, float t) {
		
		//declaring variable
		double si;
		
		//  calculating simple interest
		si = (p*r*t)/100;
		
		// print simple interest
		System.out.print("Simple interest :- "+si);
	}
	// end of method
	
	// declare main method
	public static void main(String arg[]) {
		
		//  declare variable 
		float p, r, t;
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//  taking input from user
		System.out.println("Enter Principal");
		p = sc.nextFloat();
		System.out.println("Enter rate of interest");
		r = sc.nextFloat();
		System.out.println("Enter time");
		t = sc.nextFloat();
		System.out.println(".........................................");
		
		//calling interest method for calculating simple interest
		interest(p, r, t);
		
	}
	// end of method
}
//end of class