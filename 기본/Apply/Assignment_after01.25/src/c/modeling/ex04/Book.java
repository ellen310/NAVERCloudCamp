package c.modeling.ex04;

public class Book {
	
	///Field
	private String title;
	private int price;
	
	

	///Constructor
	public Book() {
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	///Getter, Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
