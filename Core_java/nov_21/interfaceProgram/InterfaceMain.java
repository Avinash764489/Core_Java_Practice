package interfaceProgram;

//declare class and implemented some interface
public class InterfaceMain implements A,B{

	//declaring main method
	public static void main(String erg[]) {
		//declaring class object
		InterfaceMain obj = new InterfaceMain();
		//calling interface method from class object
		obj.show();
		obj.display();
		obj.call();
		
	}
	//end of main method
	
	//declare interface method
	public void show() {
		System.out.println("Testing 1");
	}
	//end of interface method
	
	//declare interface method
	public void display() {
		System.out.println("Testing 2");
	}
	//end of interface method
	
	//declare interface method
	public void call() {
		System.out.println("Testing 3");
	}
	//end of interface method
	
}
//end of class

// declare interface
interface A{
	
	// declare abstract method
	public void show();
	
	//declare abstract method
	public void display();
	
}
//end of interface

//declare interface
interface B{
	
	//declare abstract methods
	public void call();
	public void display();
}
//end of interface