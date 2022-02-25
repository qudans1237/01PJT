package test;

import java.util.Scanner;

public class Prob09 {
	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);
		System.out.println("0보다 큰 홀수를 입력하세요");
		line = input.nextInt();
		int count = (line/2+1);
		
		if(line>0 || line %2 != 0) {
		for (int i = 0; i < (line/2)+1; i++) {
			for (int j = 0; j <line-i-count; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		}
	}
} 