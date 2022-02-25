package algorithm;

import java.util.Scanner;

public class level3step2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력해주세요");
		int num = scanner.nextInt();
		int arr[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("첫번째 수를 입력해주세요");
			int a = scanner.nextInt();
			System.out.println("두번째 수를 입력해주세요");
			int b = scanner.nextInt();
			arr[i] = a+b;
		}
		
		for (int k : arr) {
			System.out.println(k);
		}
	}
}
