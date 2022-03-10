package test;



import java.util.Vector;




public class Prob28 {
	
	
	private static Book1 makeBook(String bookData) throws DataFormatException {
		Book1 bInstance = new Book1();
		String[] strSplit = bookData.split(":");
		if(!(strSplit.length < 3)) {
			bInstance.setTitle(strSplit[0]);
			bInstance.setKind(strSplit[1]);
			bInstance.setRentalPrice(Integer.parseInt(strSplit[2]));
			
		}else {
			throw new DataFormatException(strSplit[0]+" 기초책 정보는 변환할 수 없는 데이터 포맷 입니다.");
		}
		
		return bInstance;
	}
	
	private static void printBookList(Vector bookList) {
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Vector bookList = new Vector();
		
		try {
			
			bookList.add(Prob28.makeBook("Java Programming 기초:컴퓨터:35000"));
			bookList.add(Prob28.makeBook("초보자를 위한 SQL:컴퓨터:35000"));
			bookList.add(Prob28.makeBook("HTML5 API 소개:컴퓨터:35000"));
			//case1
			bookList.add(Prob28.makeBook("JDBC Programming 기초:컴퓨터:35000"));
			//case2
			//bookList.add(makeBook("JDBC Programming 기초:컴퓨터"));
			bookList.add(Prob28.makeBook("Java Programming 기초:컴퓨터:35000"));
			Prob28.printBookList(bookList);
			
		}catch(DataFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
