/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
*/


package oct_28;
//import Scanner class
import java.util.Scanner;
//declare class
public class NestedLoop {

	//declare main method
	static void pattern(int num) {
		//declare for outer loop
				for(int i = 1; i <= num; i++) {
					//declare inner loop
					for(int j = 1; j <= num; j++) {
						//declare if
						if(i==j)
							//if condition match its break loop
							break;
						//end if
						System.out.print(j+" ");
					}
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
