package abstractEx;

public class AbstractMain extends AbstractClass {
	public void content() {
		System.out.println("Standerd Hotel room");
		
	}
	public static void main(String arg[]) {
		AbstractMain obj = new AbstractMain();
		obj.content();
		obj.room("Standerd","no","no");
		System.out.println(obj.toString());
	}
}
