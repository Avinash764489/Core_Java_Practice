//WAP to make a calculator
package oct_28;

//import Scanner class
import java.util.Scanner;
//create a class
public class WhileLoop {
	
	public static void main(String arg[]) {
		String fruit;
		Scanner sc = new Scanner(System.in);
		boolean ch = true;
		while(ch) {
			System.out.println("Enter a fruit :- ");
			fruit = sc.next();
			System.out.println("Do you want to enter more (true/false)");
			ch = sc.nextBoolean();
		}
	}
		
}