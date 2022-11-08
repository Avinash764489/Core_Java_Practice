package methodOverriding;

//declare class and inherit Parent2 class
public class Parent3 extends Parent2 {

	//declare method
	public void display() {
		super.display();  //call parent class method
		System.out.println("Parent class 3");
	}
	//end of method
}
//end of class
