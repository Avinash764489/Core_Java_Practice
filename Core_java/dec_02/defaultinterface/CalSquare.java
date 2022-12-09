package defaultinterface;
interface abc{
	int add(int a, int b);
}
public class CalSquare implements java_interface{

	
	public static void main(String arg[]) {
		int x = 10;
		CalSquare s = new CalSquare();
		
		java_interface ji = (num) -> x*x;
		abc a = (num1,num2) -> num1 + num2;
		System.out.println(a.add(4, 6));
		System.out.println(ji.square(x));
		System.out.println(s.wellcome());
		System.out.println(java_interface.thanks());
	}

	@Override
	public int square(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
}
		