package test;

import java.util.Scanner;

public class Prob07 {

	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);

		System.out.print("0보다 큰 홀수를 입력해주세요.");
		line = input.nextInt();
		if (line > 0 || line % 2 != 0) {
			for (int i = 0, add = line%2-1; i < line; i++, add--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < line - i + add; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
		}
	}
}