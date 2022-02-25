package jb02.part04;

public class Test {
	public static void main(String[] args) {
		String[][] text = new String[9][9];

		System.out.println("==================");
		for (int i = 1; i < text.length + 1; i++) {
			System.out.println(i + "단을 출력합니다.");
			for (int j = 1; j < text.length + 1; j++) {
				text[i - 1][j - 1] = i + "X" + j + "=" + i * j;
				System.out.println(text[i - 1][j - 1]);
			}
			System.out.println("==================");
		}
	}
}
