package programs;

//importing Scanner class
import java.util.Scanner;

//declare class
public class MatrixMultiplication {
	
	//declare variables
	
	
	
	//declare method
	public static void matrix1(int arr1[][], int arr2[][], int num) {
		int sum;
		int arr3[][] = new int[num][num];
		//Addition of first matrix
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				sum=0;
				arr3[i][j] = 0;
				for(int k = 0; k < num; k++) {
					sum += arr1[i][k]*arr2[k][j];
				}
				arr3[i][j] = sum;
			}
				
		}
		
		System.out.println("Multiplication of two array ..............");
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print(arr3[i][j]+"  ");
				
			}
			System.out.println();
				
		}
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
		
		//calling method to calculate multiple of two matrix
		matrix1(arr1, arr2, num);
	}
	//end of main method
}
//end of class




