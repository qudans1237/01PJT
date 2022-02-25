package test;

public class Prob05 {
	public static void main(String[] args) {
		int[] array = { 3, 24, 1, 55, 17, 43, 5 };
		int temp;
		System.out.println("[배열의 내용]");
		System.out.println("3,24,1,55,17,43,5");
		for (int i = 0; i < array.length; i++) {
			for (int j = (i + 1); j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("[클래스 실행결과]");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(",");
			} else {
				System.out.println("");
			}
		}
	}
}
