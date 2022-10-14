//WAP in java to to find the average of three number using command line argument.

class AverageCommandLine{
	public static void main(String arg[]){
		Float num1 = Float.parseFloat(arg[0]);
		Float num2 = Float.parseFloat(arg[1]);
		Float num3 = Float.parseFloat(arg[2]);
		Float average = (num1+num2+num3)/3;
		System.out.println("Average of "+num1+" , "+num2+" and "+num3+" = "+average);
	}
}