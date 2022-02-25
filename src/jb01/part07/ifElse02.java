package jb01.part07;

public class ifElse02 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
		//& ==> and연산자
		if(x==3 & y==2) {
			System.out.println("x = 1 이고 y = 2 입니다.");
		}
		//| ==> or연산자
		if(x==1|y==3) {
			System.out.println("x=1 이거나 y=3입니다.");
		}
		//&& ==> and연산자
		if(x==3 && y==2) {
			System.out.println("x=1 이고 y=2입니다.");
		}
		//|| ==> or연산자
		if(x==1||y==3) {
			System.out.println("x=1 이거나 y=3입니다.");
		}
		/*
		 1. && 와 & , ||와  | 는 수행결과는 같으나
		 2. 내부적으로는 수행방법은 엄격히 다르다
		   ==> &와 |는 :전부수행
		   ==> &&와 ||는 :전자가 결과를 예측 가능할 겨우 일부 수행하지 않음
		 */
	}
}
