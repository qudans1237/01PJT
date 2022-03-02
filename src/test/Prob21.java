package test;

public class Prob21 {

	public Prob21() {
	}
	
	public String toEncoding(String str) {
		
		String value = "";

		for(int i = 0; i < str.length();i++) {
			char c = str.charAt(i);
			
			if((c>='A'&&c<='z')||(c>='0'&&c<='9')||c==' ') {
				value += c;
			}else {
				
				String temp = c+"";
				byte[] strBytes=temp.getBytes();
				
				for (int j = 0;j<strBytes.length;j++) {
					value += "%"+Integer.toHexString(strBytes[j]).toUpperCase().substring(6,8);
				}
			}
		}
		return value;	
	}
	
	public static void main(String[] args) {
		Prob21 p1 = new Prob21();
		System.out.println("입력 : Korea");
		System.out.println("출력 : "+p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : "+p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : "+p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong길 동");
		System.out.println("출력 : "+p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : "+p1.toEncoding("0319"));
	
	}
	
	
	
}