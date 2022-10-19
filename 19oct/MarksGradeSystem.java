//WAP in java to print the grades according to its percentage and give remarks.
//importing Scanner class
import java.util.Scanner;
//create class
class MarksGradeSystem{

	//create method
	static void marks(){

		//Create Scanner class object
		Scanner sc = new Scanner(System.in);

		//Declearing variable
		float maths, science, english;

		//Taking input from user
		System.out.println("Enter your marks in Maths");
		maths = sc.nextFloat();

		//Taking input from user
		System.out.println("Enter your marks in Science");
		science = sc.nextFloat();

		//Taking input from user
		System.out.println("Enter your marks in English");
		english = sc.nextFloat();


		//call percentage method
		percent(maths, science, english);
	}

	static void percent(float m1, float m2, float m3){
		float percents = (m1+m2+m3)/3;
		System.out.println("Your over all percentage is :- "+percents);
		System.out.println();

		//call grade method
		grade(percents);
	}
	static void grade(float percentage){
		char grades;

		//if_else ladder
		if(percentage>=80)
			grades='O';
		else if(percentage>=75)
			grades='A';
		else if(percentage>=70)
			grades='B';
		else if(percentage>=60)
			grades='C';
		else if(percentage>=50)
			grades='D';
		else if(percentage>=40)
			grades='E';
		else
			grades='F';
		//close if_else ladder

		if(grades=='F')
			System.out.println("Fail" );
		else
			System.out.println("Grade is :- "+grades);

		//call remark method
		remark(grades);
	}

	static void remark(char grades){

		//switch case
		switch(grades){
		case 'O':System.out.println("Excellent performance......");
			break;
		case 'A':System.out.println("Very very Good performance....");
			break;
		case 'B':System.out.println("Very good....");
			break;
		case 'C':System.out.println("Good... can do better");
			break;
		case 'D':System.out.println("Fair... Need to work very hard");
			break;
		case 'E':System.out.println("Fair..... You need to do more hard work");
			break;
		case 'F':System.out.println("Fail..... Better luck next time");
			break;
		default: System.out.println("Wrong input");
		}
		//end of switch case

	}

	//create main class
	public static void main(String arg[]){
		
		//call marks method
		marks();

	//ending of main method
	}
//ending of class	
}
