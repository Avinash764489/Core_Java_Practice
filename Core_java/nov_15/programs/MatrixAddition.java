package programs;

//importing Scanner class
import java.util.Scanner;

//declare class
public class MatrixAddition {
	
	//declare variables
	private static int num1=0, num2=0, sum;
	
	//declare method
	public static void matrix1(int arr1[][], int num) {
		
		//Addition of first matrix
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++)
				num1 += arr1[i][j];
		}
	}
	//end of method
	
	//declare method
	public static void matrix2(int arr2[][], int num) {
		
		//Addition of first matrix
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++)
				num2 += arr2[i][j];
		}
	}
	//end of method
	
	//declare method
	public static void display() {
		
		//calculation
		sum = num1+num2;
		System.out.println("Sum of two arrays is : "+sum);
	}
	//end of method
	
	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		int num;
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//taking an user input
		System.out.println("Enter the number of rows and column in array");
		num = sc.nextInt();
		
		//declare multidimensional array
		int arr1[][] = new int[num][num];
		int arr2[][] = new int[num][num];
		
		//declare elements in array using for loop
		System.out.println("Enter "+(num*num)+" elements to fill in the first array");
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++)
				arr1[i][j] = sc.nextInt();
		}
		System.out.println("Enter "+(num*num)+" elements to fill in the second array");
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++)
				arr2[i][j] = sc.nextInt();
		}
		
		//calling method to add the matrix
		matrix1(arr1, num);
		matrix2(arr2, num);
		display();
	}
	//end of main method
}
//end of class
