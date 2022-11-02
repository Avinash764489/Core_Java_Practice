package constructor;

public class Constructor {


	private String msg;

	Constructor() {

		System.out.println("Welcome To Java");
	}

	Constructor(String msg) {
		this(); // calling default constructor
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}