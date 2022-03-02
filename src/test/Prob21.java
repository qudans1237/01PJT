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