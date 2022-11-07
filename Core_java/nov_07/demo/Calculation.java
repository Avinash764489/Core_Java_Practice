package demo;


//declare class
public class Calculation {
	
	//declare method
	public void add(int num) {
		num++;
		System.out.println(num);
	}
	//end of method
	
	
	//declare method
	public void add(int num1, int num2) {
		System.out.println("Sum = "+(num1 + num2));
	}
	//end of method
	
	//declare method
	public void add(char ch) {
		System.out.println((int)ch);
	}
	//end of method
	
	//declare method
	public void add(float num1, float num2) {
		System.out.println("Sum = "+(num1+num2));
	}
	//end of method
	
	//declare main method
	public static void main(String arg[]) {
		//create class object
		Calculation obj = new Calculation();
		//call method with class object
		obj.add('B');
		//call method with class object
		obj.add(8);
		//call method with class object
		obj.add(8,48);
		//call method with class object
		obj.add(9.4f, 9.4f);
	}
	//end of method

}
//end of class
