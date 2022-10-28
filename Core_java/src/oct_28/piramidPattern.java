/*
           1 1 
        1 2 2 1 
      1 2 3 3 2 1 
    1 2 3 4 4 3 2 1 
  1 2 3 4 5 5 4 3 2 1 
 */

package oct_28;
//import Scanner class
import java.util.Scanner;
//declare class
public class piramidPattern {


	//declare main method
	static void pattern(int num) {
		//declare for outer loop
				for(int i = 1; i <= num; i++) {
					//declare inner loop
					for(int j = num; j >= 1; j--) {
						System.out.print("  ");
						if(i==j)
							//if condition match its break loop
							break;
						//end if
						
					}
					//declare inner loop
					for(int j = 1; j <= num; j++) {
						
						System.out.print(j+" ");
						if(i==j)
							//if condition match its break loop
							break;
						//end if
					}
					//declare inner loop
					for(int j = i; j >= 1; j--) {
						//declare if
						System.out.print(j+" ");
						
						
					}
					//end of inner loop
					System.out.println();
				}
				//end of outer loop
	}
	
	static void pros(int num) {
		//declare for outer loop
		for(int i = 1; i <= num; i++) {
			
			//end of inner loop
			System.out.println();
		}
		//end of outer loop
	}
	
	//declare main method
	public static void main(String arg[]) {
		//create Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row you want to print the pattern");
		//taking input from user
		int num = sc.nextInt();
		pattern(num);
	}
	//end of main method
}
//end of class



