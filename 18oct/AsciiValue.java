import java.util.Scanner;
class AsciiValue{
	public static void main(String[] args) {

		//create scanner object
		Scanner sc = new Scanner(System.in);

		//Taking char value
		char char1 = sc.next().charAt(0);
		char charValue = 'B';

		//convert char to asciiValue
		int asciiValue1 = char1;
		int asciiValue = charValue;

		int num1 = 67;
		int num2 = 67;
		int sum1 = num1++;
		int sum2 = ++num1;
		int sub1 = num1--;
		int sub2 = --num1;

		//print value
		System.out.println("The ascii value of "+charValue+" is :- "+asciiValue);
		System.out.println("The ascii value of "+char1+" is :- "+asciiValue1);
		System.out.println("Value of preincriment is :- "+sum2);
		System.out.println("Value of preincriment is :- "+(num2));
		System.out.println("Value of postincriment is :- "+sum1);
		System.out.println("Value of postincriment is :- "+(num1++));
		System.out.println("Value of predeincriment is :- "+sub2);
		System.out.println("Value of predeincriment is :- "+(--num2));
		System.out.println("Value of postdeincriment is :- "+sub1);
		System.out.println("Value of postdeincriment is :- "+(num2--));
		System.out.println("Value in tild :- "+(~num2));
	}
}