package methodOverriding;

//declaration of class and extends another class
public class Child extends Parent3{
	
	//declaration of method
	public void display() {
		
		//call parent class display method
		super.display();
		
		
		System.out.println("Derived class");
	}
	//end of method
	
	//declare main method
	public static void main(String arg[]) {
		
		//create child class object
		Child obj = new Child();
		
		//call display function with the help of child class object
		obj.display();
		
		//create Parent3 class object
		Parent3 obj2 = new Parent3();
		
		//call display method with the help of parent3 class object 
		obj2.display();
		
		
	}
	//end of method
}
//end of class