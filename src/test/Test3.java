package test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 두자리 정수를 입력해주세요");
		int a = scanner.nextInt();
		System.out.println("두번째 두자리 정수를 입력해주세요");
		int b = scanner.nextInt();

		if (a % 2 == 0) {
			if (a % 3 != 0) {
				System.out.println("입력하신 1번째 인자값" + a + "는 짝수이며, 3의 배수가 아닙니다.");
			} else {
				System.out.println("입력하신 1번째 인자값" + a + "는 짝수이며, 3의 배수가 맞습니다.");
			}
		} else {
			if (a % 3 != 0) {
				System.out.println("입력하신 1번째 인자값" + a + "는 홀수이며, 3의 배수가 아닙니다.");
			} else {
				System.out.println("입력하신 1번째 인자값" + a + "는 홀수이며, 3의 배수가 맞습니다.");
			}
		}
		if (b % 2 == 0) {
			if (b / 3 != 0) {
				System.out.println("입력하신 2번째 인자값" + b + "는 짝수이며, 3의 배수가 아닙니다.");
			} else {
				System.out.println("입력하신 2번째 인자값" + b + "는 짝수이며, 3의 배수가 맞습니다.");
			}
		} else {
			if (b / 3 != 0) {
				System.out.println("입력하신 2번째 인자값" + b + "는 홀수이며, 3의 배수가 아닙니다.");
			} else {
				System.out.println("입력하신 2번째 인자값" + b + "는 홀수이며, 3의 배수가 맞습니다.");
			}
		}
	}
}
