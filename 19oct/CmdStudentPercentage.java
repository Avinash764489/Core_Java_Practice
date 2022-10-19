//importing Scanner class
import java.util.Scanner;
//create class
class CmdStudentPercentage{
	//create main class
	public static void main(String arg[]){
		//Create Scanner class object
		Scanner sc = new Scanner(System.in);

		//Taking input from user
		float maths = Float.parseFloat(arg[0]);
		float science = Float.parseFloat(arg[1]);
		float english = Float.parseFloat(arg[2]);

		//print maths marks
		System.out.println("Your marks in Maths :- "+maths);

		//print Science marks
		System.out.println("Your marks in Science :- "+science);
		

		//Print English marks
		System.out.println("Your marks in English :- "+english);
		

		//calculating over all percentage
		float sum = (maths+science+english)/3;

		//Using if_else condition to check student is pass or fail
		if(sum>=40){

			//print if student is pass
			System.out.println("Your over all percentage is :- "+sum);
			System.out.println("Congratulation you are pass");
		}else{

			//print if student is fail
			System.out.println("Your over all percentage is :- "+sum);
			System.out.println("Sorry You are fail");

		//ending of if_else	
		}
	//ending of main method
	}
//ending of class	
}