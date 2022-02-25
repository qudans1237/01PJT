package test;

public class SortUtil {
	public SortUtil() {
	}

	public int[] ascending(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {

			for (int j = (i + 1); j < numbers.length; j++) {

				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		SortUtil util = new SortUtil();
		int[] numbers = new int[] { 7, 5, 2, 19, 34, 51, 32, 11, 67, 21 };
		numbers = util.ascending(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);

			if (i != numbers.length - 1) {

				System.out.print(",");
			} else {
				System.out.println("");
			}
		}

		System.out.println("Successful!!!");
	}//end of main
}//end of class