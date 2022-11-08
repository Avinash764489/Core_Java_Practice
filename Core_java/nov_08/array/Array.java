package array;

//import Scanner class 
import java.util.Scanner;

//declare class
public class Array {

	//declare main method
	public static void main(String arg[]) {
		
		//create object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//declare single dimensional static array
		int arr2[] = {34,456,65,56};
		
		//declare Multidimensional static array
		int arr3[][] = {{34,56,56,6},{56,34,4,56},{545,56,6,65},{34,45,45,65}};
		
		//declare Single dimensional dynamic array
		//take input from user
		System.out.println("Enter number of rows in dynamic array");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the element of dynamic array");
		//put values in dynamic array using for loop
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Single dimensional Static array");
		//print values present in array using for-each loop
		for(int i: arr2) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("SIngle dimensional dynamic array ");
		//print values present in array using for loop
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("Multi dimensional static array");
		//print values present in array using for loop
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
