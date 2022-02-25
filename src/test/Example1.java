package test;

//import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("1~100 정수중 한가지를 입력해주세요");
//		int score = scanner.nextInt();
//		
//		if(score<=59 && score >= 0) {
//			System.out.println("입력하신 값 "+score+"는 과락입니다.");
//		}else if(score>59 && score<=69) {
//			System.out.println("입력하신 값 "+score+"는 양입니다.");
//		}else if(score>69 && score<=79) {
//			System.out.println("입력하신 값 "+score+"는 미입니다.");
//		}else if(score>79 && score<=89) {
//				System.out.println("입력하신 값 "+score+"는 우입니다.");
//		}else if(score>89 && score<=100) {
//			System.out.println("입력하신 값 "+score+"는 수입니다.");
//		}else {
//			System.out.println("정확한 값을 입력해주세요");
//		}
		
	
		int inputData = Integer.parseInt(args[0]);
		if(args.length !=1) {
			System.out.println("0~100 수 입력");
			return;
		}
		if(inputData>100 || inputData<0) {
			System.out.println("0~100 수 입력");
			return;
		}
		String grade = "수";
		switch(inputData/10) {
		case 10:
		case 9:
			break;
		case 8:
			grade="우";
			break;
		case 7:
			grade="미";
			break;
		case 6:
			grade="양";
			break;
		default:
			grade="가";
		}//end of switch
		System.out.print("입력하신"+inputData+"의 성정은 "+grade+"입니다.");
	}//end of main
}//end of class
