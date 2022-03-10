package test;



public class Prob22 {

	public String toEncoding(String str) {
		
		String hexStr = "";
		byte[] value = str.getBytes();
		
		for(Byte arrayByte : value) {
			if(!(arrayByte >= 'A' && arrayByte <= 'z')) {
				if(arrayByte == ' ') {
					hexStr += ' ';
				}else if(arrayByte >= '0' && arrayByte <= '9'){
					hexStr += (char)arrayByte.intValue();
				}else {
					hexStr += "%"+Integer.toHexString(arrayByte).substring(6).toUpperCase();
				}
				
			}else 
				hexStr += (char)arrayByte.intValue();
			}
			
		
		return hexStr;
	}
	
	
	public static void main(String[] args) {
		Prob22 p1 = new Prob22();
		System.out.println("�Է�: "+"Korea");
		System.out.println("���: "+p1.toEncoding("Korea"));
		System.out.println("�Է�: "+"ȫ�浿");
		System.out.println("���: "+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է�: "+"ȫ �� ��");
		System.out.println("���: "+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է�: "+"Hong �� ��");
		System.out.println("���: "+p1.toEncoding("Hong �� ��"));
		System.out.println("�Է�: "+"0319");
		System.out.println("���: "+p1.toEncoding("0319"));


	}

}
