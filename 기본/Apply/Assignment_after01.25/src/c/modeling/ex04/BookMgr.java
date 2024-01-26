package c.modeling.ex04;

public class BookMgr {
	
	///Field
	Book[] booklist;

	
	///Constructor
	public BookMgr() {
	}
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	

	///Method
	void printBookList() {
		for(int i=0;i<booklist.length;i++) {
			System.out.println(booklist[i].getTitle());
		}
		System.out.println();
	}
	
	void printTotalPrice() {
		int sum=0;
		for(int i=0;i<booklist.length;i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합: "+ sum);	
	}
}
