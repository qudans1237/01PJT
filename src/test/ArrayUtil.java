package test;

public class ArrayUtil {
//	public char[] reverseString(char[] s, int start, int end) {
//		char[] a = {};
//		char[] reversedArr = new char[s.length];
//		for (int j = 0; j < s.length; j++) {
//			if(j<start||j>end) {
//				a[j] = s[j];
//			}else if(j==start||j<=end){
//			for (int i = start; i < end + 1; i++) {
//				reversedArr[end - i] = s[i];
//			}}else {
//				
//			}
//			
//			
//		}
////		String reversedStr = new String(reversedArr);
//		return a;
//	}
	public char[] reverseString(char[] sss, int start, int end) {
		char[] tempCharArr = (char[]) sss.clone();
		char tempChar;

		while (start < end) {
			tempChar = tempCharArr[start];
			tempCharArr[start] = tempCharArr[end];
			tempCharArr[end] = tempChar;
			start++;
			end--;
		}
		return tempCharArr;
	}

	public static void main(String arg[]) {
		ArrayUtil au = new ArrayUtil();

		char[] s = { 'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm' };
		System.out.println(au.reverseString(s, 0, 3));
		System.out.println(au.reverseString(s, 4, 7));
		System.out.println(au.reverseString(s, 8, 10));
		System.out.println(au.reverseString(s, 0, 10));

	}

}