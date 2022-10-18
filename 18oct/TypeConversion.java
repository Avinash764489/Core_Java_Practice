class TypeConversion{
	public static void main(String arg[]){

		//creating sort type local variable
		short num1 = 45, num2 = 56;
		short num3 = (short)(num1+num2); //type casting int to short
		System.out.println("Short value :- "+num3);
		num2+=num1;
		System.out.println("Short value auto convarsion :- "+num2);

		//creating byte type local variable
		byte b1=56, b2=45;
		byte cal = (byte)(b1+b2);//convert int type to byte
		b1+=b2;//auto type casting

		//printing the sum
		System.out.println("The calculation is :- "+cal);
		System.out.println("The calculation is :- "+b2);

		//creating double type local variable
		double d1 = 786.65;
		double d2 = 454.56;
		float sum = (float)(d1+d2);//type casting double to float
		System.out.println("Float value "+sum);
	}
}