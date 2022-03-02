package test;

public class ArrayUtil  
{
	public char[] reverseString(char[] s, int start, int end) {
		char[] copy = new char[s.length];
		int temp = end;

		for(int i = 0; i < s.length; i++) {
			copy[i] = s[i];		
		}

		for(int i = start; i <= end; i++) {
			copy[i] = s[temp];
			temp--;
		}
		
		return copy;
	}

	public static void main(String[] args) 
	{
		ArrayUtil au = new ArrayUtil();
		char[] s = {'J','a','v', 'a' , 'P' , 'r' , 'o', 'g', 'r', 'a', 'm'};
		System.out.println(au. reverseString(s, 0, 3));
		System.out.println(au. reverseString(s, 4, 7));
		System.out.println(au. reverseString(s, 8, 10));
		System.out.println(au. reverseString(s, 0, 10));
	}
}
