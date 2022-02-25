package test;

//import java.util.Scanner;
public class Prob02 {
    public static void main(String[] args) {
		
		//limit변수에 직접 저장
		int limit = 50;
		//prime은 거짓을 저장
		boolean prime = false;
		
		//
		for (int i = 2; i < limit; i++){
			prime = true;

			for (int j = 1; j <= i; j++){
				if(i % j == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.println(i);
			}
		}

		/*
		boolean이 true일때 수를 입력받아 코드 작성해봄

		System.out.print("숫자를 입력해주세요: ");
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

		//나눌대상이므로 2를 넣어줌
		int i = 2;
        boolean Prime = true;

	    while (i <= inputNum) {
		    Prime = true;

            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    Prime = false;
                }
                continue;
		    }
		    if (Prime == true){
                System.out.println(i);
            }
		i++;
	    }
		*/

    }//end of main
}//end of class