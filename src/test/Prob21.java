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
		System.out.println("�Է� : Korea");
		System.out.println("��� : "+p1.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : "+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : "+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong�� ��");
		System.out.println("��� : "+p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : "+p1.toEncoding("0319"));
	
	}
	
	
	
}