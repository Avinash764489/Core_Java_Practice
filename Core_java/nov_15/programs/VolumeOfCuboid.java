package programs;

//importing Scanner class
import java.util.Scanner;

//declare class
public class VolumeOfCuboid {

	//declare constructor
	public VolumeOfCuboid(double num1) {
		System.out.println("Volume of cube is : "+(num1*num1*num1));
	}
	public VolumeOfCuboid(double num1, double num2, double num3) {
		System.out.println("Volume of cube is : "+(num1*num2*num3));
	}
	
	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		double num1, num2, num3;
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter a number you want to find its volume of cube");
		num1 = sc.nextFloat();
		//declare class object
		VolumeOfCuboid obj = new VolumeOfCuboid(num1);
		
		//taking input from object
		System.out.println("Enter first number you want to find its volume of cube");
		num1 = sc.nextDouble();
		System.out.println("Enter second number you want to find its volume of cube");
		num2 = sc.nextDouble();
		System.out.println("Enter third number you want to find its volume of cube");
		num3 = sc.nextDouble();
		//declare class object to access parameterized constructor
		VolumeOfCuboid obj1 = new VolumeOfCuboid(num1, num2, num3);
	}
}
