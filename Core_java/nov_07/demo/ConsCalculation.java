package demo;

//declare class
public class ConsCalculation {
	
	//declare parameterized constructor
	public ConsCalculation(int num) {
		num++;
		System.out.println(num);
	}
	//end of constructor
	
	//declare parameterized constructor
	public ConsCalculation(int num1, int num2) {
		System.out.println("Sum = "+(num1 + num2));
	}
	//end of constructor
	
	//declare parameterized constructor
	public ConsCalculation(char ch) {
		System.out.println((int)ch);
	}
	//end of constructor
	
	//declare parameterized constructor
	public ConsCalculation(float num1, float num2) {
		System.out.println("Sum = "+(num1+num2));
	}
	//end of constructor
	
	//declare main method
	public static void main(String arg[]) {
		//create class object
		ConsCalculation obj1 = new ConsCalculation(8);
		//create class object
		ConsCalculation obj2 = new ConsCalculation('A');
		//create class object
		ConsCalculation obj3 = new ConsCalculation(56, 78);
		//create class object
		ConsCalculation obj4 = new ConsCalculation(54.65f, 356.67f);
		
	}
	//end of method

}
//end of class
