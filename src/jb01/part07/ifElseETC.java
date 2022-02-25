package jb01.part07;

public class ifElseETC {
	public static void main(String[] args) {
		//==> \"사용확인
		System.out.println("입력하신\"1번째인수\"는:" +args[0]);
		System.out.println("입력하신\"2번째인수\"는:" +args[1]);
		
		System.out.println("==========================");
		
		//입력한 문자를 int DataType으로 변경 하는 Integer.parseInt()사용
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		//i,j 변수에 값을 확인하자.
		System.out.println("i="+i+"\t j="+j);  //<==특수문자\t 사용 : 출력결과확인
		System.out.println("한줄 처리\n");     // <==특수문자\n 사용 : 출력결과 확인
		
		if(i>j) {
			System.out.println("i가j 보다 큽니다.");
		} else if(i==j){
			System.out.println("i와 j 는 같습니다.");
		} else {
			System.out.println("i보다 j가 큽니다.");
		}
	}
}
