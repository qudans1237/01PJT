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
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";
		
		String prodName = getParameter(url1,"prodName");
		System.out.println("��ǰ�̸�: "+ prodName);
		
		String url2 ="http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����ð�����&userAge=26";
		
		String userAddress = getParameter(url2,"address");
		System.out.println("ȸ�� �ּ�: "+ userAddress);
	}
}
