package test;

public class Util {
	public int findPrimeCount(int limit) {

		boolean isPrime = false;
		int primeCount = 0;

		for (int i = 2; i <= limit; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeCount++;
			}
		}
		return primeCount;
	}

	public int[] findPrimeReturnArray(int limit) {
		int primeCount = this.findPrimeCount(limit);
		int[] prime = new int[primeCount];
		//int[] prime = new int[findPrimeCount(limit)];

		int temp = 0;

		boolean isPrime = false;

		for (int i = 2; i <= limit; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				prime[temp] = i;
				temp++;
			}
		}
		return prime;
	}
}
