package algorithm;

public class level2step2 {
	public static void main(String[] args) {
		int score = 100;
		
		if(score >= 0 && score <=100) {
			// 입력된 점수가 올바른 점수이므로
			// 결과 출력하는 if문 실행
			
			if (score <= 59) {
				System.out.println("F");
			} else if(score <=69) {
				System.out.println("D");
			} else if(score <=79) {
				System.out.println("C");
			} else if(score <= 89) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
			
		} else {
			// 입력된 점수가 올바르지 않은 점수이므로
			// 경고 메세지만 출력
			System.out.println("잘못된 형태의 점수입니다.");
		}
	}
}
