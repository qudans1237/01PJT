package test;

public class Book1 {
	///Field
	private String title;
	private String kind;
	private int rentalPrice;
	
	///Constructor
	public Book1() {
		
	}


	///Method
	
	public String getTitle() {
		return title;
	}

	public String getKind() {
		return kind;
	}

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", kind=" + kind + ", rentalPrice=" + rentalPrice + "]";
	}
	

}
