package test;

public class Prob16 {
	public String leftPad(String str, int size, char padChar) {
		int length = str.length();
		
		if(length>= size) {
			return str;
		}
		String result="";
		for(int i =0; i<size-length;i++) {
			result+=padChar;
		}
		result +=str;
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		Prob16 prob16 = new Prob16();
		
		System.out.println(prob16.leftPad("ABC", 6, '#'));
		System.out.println(prob16.leftPad("ABC", 5, '$'));
		System.out.println(prob16.leftPad("ABC", 2, '&'));
	}
}
