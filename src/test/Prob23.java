package test;

public class Prob23 {

	
	public static String getParameter(String url, String paramName) {
		String getParam = "";
		
		if(paramName.equals("prodName")) {
			getParam = url.substring(url.indexOf(paramName)+paramName.length()+1,url.indexOf("&price"));
		}else {
			getParam = url.substring(url.indexOf(paramName)+paramName.length()+1,url.indexOf("&userAge"));
		}
		
		return getParam;
	}
	
	
	
	public static void main(String[] args) {
		
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName = Prob23.getParameter(url1,"prodName");
		System.out.println("제품 이름: "+prodName);
		
		String url2 = "http://localhost/registUser?userId=홍길동&address=서울시 강남구&userAge=26";
		String userAddress = Prob23.getParameter(url2,"address");
		System.out.println("회원 주소: "+userAddress);
		
		
		

	}

}
