package test;

public class Prob17 {

	public static String myReplace(String str, char oldChar, char newChar) {
		String[] strArr = str.split("");
		
		for(int i = 0; i < strArr.length; i++) {
			String oldStr = Character.toString(oldChar);
			strArr[i] = strArr[i].equals(oldStr) ? Character.toString(newChar) : strArr[i];
		}
		
		return String.join("", strArr);
	}

	public static void main(String[] args) {
		System.out.println("문자열에 특정 문자 변경하는 테스트");
		System.out.println("------------sample1-------------");
		String str1 = myReplace("hello world", 'l','*');
		System.out.println(str1);
		
		System.out.println("------------sample2-------------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);
		
		System.out.println("------------sample3-------------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);
		
		
	}
}