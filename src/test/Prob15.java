package test;

public class Prob15 {
		
	public static void main(String[] args) {
		
		int limit = 67;
		
		Util util = new Util();
		
		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~"+limit+"까지의 소수의 개수는 "+ primeCount+"EA이며 소수는 아래와 같다");
		
		System.out.println("///////////////////////////");
		
		int[] primeArray = util.findPrimeReturnArray(limit);
		
		for(int i =0 ; i<primeArray.length;i++) {
			System.out.print(primeArray[i]+((primeArray.length-1)!=i?",":""));
			//((primeArray.length-1)!=i?",":"")) if문으로 처리해봅시다.
		}
	}
}