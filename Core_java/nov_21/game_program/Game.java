/**
 * 
 */
package game_program;

import java.util.*;

public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration of variables
		int num1 = 5, num2 = 3, num, num3, count = 0, n;
		
		// declaration of arrays
		int arr5[][] = new int[num1][num2];
		int arr2[] = new int[num1];
		int arr3[] = new int[num1];
		int arr4[] = new int[num1];
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 15 numbers");
		//initialization of array using for loop
		num = 0;
//		for(int i = 0; i < num1; i++) {
//			for(int j = 0; j < num2; j++) {
//				System.out.println("Enter "+(15-num)+" out of 15");
//				num++;
//				arr1[i][j] = sc.nextInt();
//			}
//		}
		int arr1[][] = {{37,2,3},{7,8,9},{45,67,89},{34,4,5},{6,98,57}};
		
		// print all elements of array
		System.out.println("-------------------");
		for(int i = 0; i < num1; i++) {
			System.out.print("|  ");
			for(int j = 0; j < num2; j++) {
				if(arr1[i][j]<10)
					System.out.print(arr1[i][j]+"  |  ");
				else
					System.out.print(arr1[i][j]+" |  ");
			}
			System.out.println();
			System.out.println("-------------------");
		}
		System.out.println("Choose a column");
		//first choose column number by user
		num3 = sc.nextInt();
		System.out.println();
		
		// initialing all numbers of chosen first time in another array 
		for(int i = 0; i < num1; i++) {
			arr2[i] = arr1[i][num3-1];
		}
		int ch1=0;
		
		//Rearrange main array elements
		for(int i = 0; i < num1; i++) {
			if(i>2) {
				n = i-3;
				ch1 = arr1[1][n];
				arr1[1][n] = arr2[i];
				
			}else {
				ch1 = arr1[0][i];
				arr1[0][i] = arr2[i];
			}
			arr1[i][num3-1] = ch1;
			
		}
		
		//printing all numbers after Rearrange
		System.out.println("-------------------");
		for(int i = 0; i < num1; i++) {
			System.out.print("|  ");
			for(int j = 0; j < num2; j++) {
				if(arr1[i][j]<10)
					System.out.print(arr1[i][j]+"  |  ");
				else
					System.out.print(arr1[i][j]+" |  ");
			}
			System.out.println();
			System.out.println("-------------------");
		}
		
		System.out.println("Choose a column");
		//first choose column number by user
		num3 = sc.nextInt();
		System.out.println();
		
		// initialing all numbers of chosen second times in another array 
		for(int i = 0; i < num1; i++) {
			arr3[i] = arr1[i][num3-1];
		}
		
		//Rearrange main array elements
		for(int i = 0; i < num1; i++) {
			if(i>2) {
				n = i-3;
				ch1 = arr1[1][n];
				arr1[1][n] = arr3[i];
				
			}else {
				ch1 = arr1[0][i];
				arr1[0][i] = arr3[i];
			}
			arr1[i][num3-1] = ch1;
			
		}
		
		//printing all numbers after Rearrange
		System.out.println("-------------------");
		for(int i = 0; i < num1; i++) {
			System.out.print("|  ");
			for(int j = 0; j < num2; j++) {
				if(arr1[i][j]<10)
					System.out.print(arr1[i][j]+"  |  ");
				else
					System.out.print(arr1[i][j]+" |  ");
			}
			System.out.println();
			System.out.println("-------------------");
		}
				
		System.out.println("Choose a column");
		//first choose column number by user
		num3 = sc.nextInt();
		System.out.println();
		
		// initialing all numbers of chosen second times in another array 
		for(int i = 0; i < num1; i++) {
			arr4[i] = arr1[i][num3-1];
		}
				
		//Rearrange main array elements
		for(int i = 0; i < num1; i++) {
			if(i>2) {
				n = i-3;
				ch1 = arr1[1][n];
				arr1[1][n] = arr4[i];
				
			}else {
				ch1 = arr1[0][i];
				arr1[0][i] = arr4[i];
			}
			arr1[i][num3-1] = ch1;
			
		}
		
		//searching of number
		for(int i=0; i<num1; i++) {
			for(int j = 0; j<num1; j++) {
				for(int k =0; k<num1; k++) {
					if(arr2[i]==arr3[j]) {
						if(arr2[i]==arr4[k]) {
							count = arr4[k];
							break;
						}
					}else {
						continue;
					}
				}
			}
		}
		
		//printing the number
		System.out.println("Your number is "+ count);
		System.out.println();	
	}
}
