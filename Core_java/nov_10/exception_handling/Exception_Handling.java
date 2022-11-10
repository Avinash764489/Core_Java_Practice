package exception_handling;

import java.util.*;

public class Exception_Handling {
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		try {
			System.out.println("Enter 2 numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
