package books;

public class BooksInfo {
	private int book_id;
	private String book_name, auther_name;
	private float book_price;
	public BooksInfo() {
		super();
		this.book_id = 34;
		this.book_name = "Ponniyan selvan";
		this.auther_name = "Kalki";
		this.book_price = 4506.90f;
	}
	@Override
	public String toString() {
		return "Books Info is book_id=" + book_id + ", book_name=" + book_name + ", auther_name=" + auther_name
				+ ", book_price=" + book_price ;
	}
	
}
