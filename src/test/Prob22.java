package test;

public class Prob22 {

	public Prob22() {
	}
	private static String getParameter(String url,String paramName) {
		
		int index = url.indexOf("?");
		String tmp1 = url.substring(index + 1, url.length());
		
		String[] tmp2 = tmp1.split("&");
		String result = null;
		
		for(int i = 0; i< tmp2.length; i++) {
			String[] tmp3 = tmp2[i].split("=");
			result = tmp3[1];
			break;
		}
	return result;
	}
	
	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName = getParameter(url1,"prodName");
		System.out.println("제품이름: "+ prodName);
		
		String url2 ="http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시강남구&userAge=26";
		
		String userAddress = getParameter(url2,"address");
		System.out.println("회원 주소: "+ userAddress);
	}
}
