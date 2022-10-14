//Type Casting

class TypeCast{
	public static void main(String arg[]){
		System.out.println("Name :- "+arg[0]+" "+arg[1]);
		int n = Integer.parseInt(arg[2]);//type casting form String to Integer
		System.out.println("Age :- "+n);
		float f = Float.parseFloat(arg[3]);//type casting form String to Float
		System.out.println("Marks :- "+f);
	}
}