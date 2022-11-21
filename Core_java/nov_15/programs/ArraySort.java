package programs;

import java.util.Arrays;
//importing Scanner class
import java.util.Scanner;

//declare class
public class ArraySort {

	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		int num;
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter number of rows in array");
		num = sc.nextInt();
		
		//declare array
		int []arr = new int[num];
		
		//Initialization of array using for loop
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		//sorting array
		Arrays.sort(arr);
		
		//printing all the elements of array
		System.out.println("All the elements of an array");
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i]+", ");
		}
	}
}
