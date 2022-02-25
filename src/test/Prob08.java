package test;

public class Prob08 {
	int result = 0;
	int num1;
	int num2;

	public Prob08() {
	}

	public int abs(int num1, int num2) {
		result = num1 - num2;
		if (num1 < num2) {
			result = -result;
		}
		return result;
	}

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 6;
		int result = 0;
		Prob08 prob = new Prob08();
		System.out.println("두 수의 차는" + prob.abs(num1, num2));
	}//end of main
}// end of class