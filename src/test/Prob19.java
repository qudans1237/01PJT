package test;

public class Prob19 {
	private static String[] stringSplit(String str1,String str2) {
		return null;
	}
	
	public static void main(String[] args) {
		
		String str = "PROD=001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str,"#");
		System.out.println("==== 문자열 처리 결과====");
		
		for(int i =0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	
}
