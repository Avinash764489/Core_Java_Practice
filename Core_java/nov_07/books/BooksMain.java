package books;

public class BooksMain extends BooksInfo {
	int shipping_charges = 10;
	void print() {
		System.out.println(toString());
	}
	public static void main(String arg[]) {
		BooksMain obj = new BooksMain();
		obj.print();
	}
}
