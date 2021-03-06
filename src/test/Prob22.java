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
		System.out.println("입력: "+"Korea");
		System.out.println("출력: "+p1.toEncoding("Korea"));
		System.out.println("입력: "+"홍길동");
		System.out.println("출력: "+p1.toEncoding("홍길동"));
		System.out.println("입력: "+"홍 길 동");
		System.out.println("출력: "+p1.toEncoding("홍 길 동"));
		System.out.println("입력: "+"Hong 길 동");
		System.out.println("출력: "+p1.toEncoding("Hong 길 동"));
		System.out.println("입력: "+"0319");
		System.out.println("출력: "+p1.toEncoding("0319"));


	}

}
