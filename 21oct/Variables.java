//declearation of variables
//create a class
class Variables{


	//create instence veriable
	static int num1;
	int num2;
	String str;

	public static void main(String arg[]){

		int num3 //local variable

		//call static variable
		System.out.println(num1);

		//create class object
		Variables obj = new Variables();
		//call non-static variable with class object
		System.out.println(obj.num2);
		
		System.out.println(obj.num3);
	}
	//ends of main method
}
//ends of class