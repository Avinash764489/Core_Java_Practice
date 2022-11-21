package abstractProgramming;

//declare class and inherit Abstract class
public class AbstractMain extends Abstract_Class {

	//declare main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare class object
		AbstractMain obj = new AbstractMain();
		
		// calling abstract method from class object
		obj.display();
		obj.print();
	}
	//end of main method

	@Override
	//declare method 
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("derived class");
	}
	//end of method
}
//end of class
