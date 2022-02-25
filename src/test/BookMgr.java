package test;

public class BookMgr {
	Book[] booker = new Book[5];

	public BookMgr(Book[] booklist) {
		this.booker = booklist;
	}

	public void printBooklist() {
		for (int i = 0; i < booker.length; i++) {
			System.out.println(booker[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < booker.length; i++) {
			sum += booker[i].getPrice();
		}
		System.out.println(sum);
	}
}
