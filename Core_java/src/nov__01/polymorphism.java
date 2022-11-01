package nov__01;

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes square = new Shapes();
		square.calculateArea(89.7f);

		Shapes rectangle = new Shapes();
		rectangle.calculateArea(54.3f, 67.5f);

		Shapes circle = new Shapes();
		circle.calculateArea(5.4);

	}

}