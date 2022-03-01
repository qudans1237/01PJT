package test;

public class Prob17 {

	public static String myReplace(String str, char oldChar, char newChar) {
		
		String result ="";
		
		for(int i =0;i<str.length();i++) {
			
			if(str.charAt(i) == oldChar) {
				result += newChar;
			}else {
				result += str.charAt(i);
			}
		}
		return result;
	}		
	
	
	public static void mian(String[] args) {
		
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("=====Sample 1 ========");
		String str1 = Prob17.myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("=====Sample 2 ========");
		String str2 = Prob17.myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("=====Sample 3 ========");
		String str3 = Prob17.myReplace("hello world",'a','*');
		System.out.println(str3);
	}
	
}
