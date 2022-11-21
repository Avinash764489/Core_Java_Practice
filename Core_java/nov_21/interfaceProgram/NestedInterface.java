package interfaceProgram;

public class NestedInterface implements C.B, C{

	public static void main(String arg[]) {
		
		NestedInterface obj = new NestedInterface();
		obj.display();
		obj.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Outer layer");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inner layer");
	}
}

interface C{
	public void display();
	
	interface B{
		public void show();
	}
}
