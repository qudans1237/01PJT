package test;

public class Prob11 {

	public static void main(String[] args) {

		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };
		int aodd = 0;
		int aeven = 0;
		int bodd = 0;
		int beven = 0;

		for (int i = 0; i < ia.length; i++) {
			if (ia[i] % 2 == 0) {
				aeven += ia[i];
			} else {
				aodd += ia[i];
			}
		}
		for (int i = 0; i < ib.length; i++) {
			if (ib[i] % 2 == 0) {
				beven += ib[i];
			} else {
				bodd += ib[i];
			}
		}

		System.out.println("(¹è¿­ia)");
		System.out.println("È¦¼öÀÇ ÇÕ:  " + aodd);
		System.out.println("Â¦¼öÀÇ ÇÕ:  " + aeven);
		System.out.println("(¹è¿­ib)");
		System.out.println("È¦¼öÀÇ ÇÕ:  " + bodd);
		System.out.println("Â¦¼öÀÇ ÇÕ:  " + beven);

	}
}