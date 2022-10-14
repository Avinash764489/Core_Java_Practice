//importing Scanner class
import java.util.Scanner;
//Declearation of class
class ScannerClass{
	//main method
	public static void main(String arg[]){
		//create object of scanner class
		Scanner sc = new Scanner(System.in);

		//delcearing local variable
		// integer variable
		System.out.println("Enter Integer value"); 
		int number1 = sc.nextInt(); //take integer value
		System.out.println("Integer = "+number1); 

		//boolean variable
		System.out.println("Enter boolean value"); 
		boolean status = sc.nextBoolean(); //take boolean value
		System.out.println("Boolean = "+status);

		//float variable
		System.out.println("Enter float value"); 
		float f1 = sc.nextFloat(); //take float value
		System.out.println("Float = "+f1);

		//double variable
		System.out.println("Enter double value"); 
		double d1 = sc.nextDouble(); //take double value
		System.out.println("Double = "+d1);

		//String variable
		System.out.println("Enter String");
		String str = sc.next(); //take string value
		System.out.println("String = "+str);
	}
	//end of main
}
//end of class