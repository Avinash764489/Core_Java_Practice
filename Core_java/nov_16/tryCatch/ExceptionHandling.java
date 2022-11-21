package tryCatch;

//importing all class of util package
import java.util.*;

// declare class
public class ExceptionHandling {

	//declare variables
	private int a, b, c;
	
	//declare method
	public void get() {
		//declare try-catch for exception
		try(Scanner sc = new Scanner(System.in);){
			//input from user
			System.out.println("Enter two number");
			a = sc.nextInt();
			b = sc.nextInt();
			//calculation
			c = a/b;
			
		}
		//end of try block
		
		//catch handles more than one exception
		catch(ArithmeticException | InputMismatchException e){
			System.out.println(e.getMessage());
		}
		//end of catch block
		
		// finally block
		finally {
			System.out.println(c);
		}
		//end of finally block
	}
	//end of method
	
	//declare main method
	public static void main(String arg[]) {
		
		//declare class object
		ExceptionHandling obj = new ExceptionHandling();
		//calling method using class object
		obj.get();
	}
	//end of main method
}
//end of class
