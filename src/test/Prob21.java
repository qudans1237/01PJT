package test;

public class Prob21 {

	public Prob21() {
	}
	
	public String toEncoding(String str) {
		
		String value = str;
		byte[] temp = value.getBytes();
		System.out.println(Integer.toHexString(temp[0]));
		System.out.println(Integer.toHexString(temp[1]));
	
		
		return null;
		
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