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
		
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";
		
		String prodName = Prob23.getParameter(url1,"prodName");
		System.out.println("��ǰ �̸�: "+prodName);
		
		String url2 = "http://localhost/registUser?userId=ȫ�浿&address=����� ������&userAge=26";
		String userAddress = Prob23.getParameter(url2,"address");
		System.out.println("ȸ�� �ּ�: "+userAddress);
		
		
		

	}

}
