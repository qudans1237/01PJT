package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob31 {
	
	//static method
	public static char CheckGrade(double avg) {
		char grade = 'F';
		
		if(avg <= 100 && avg >= 90) {
			grade = 'A';
		}else if(avg <= 89 && avg >= 80){
			grade = 'B';
		}else if(avg <= 79 && avg >= 70){
			grade = 'C';
		}else if(avg <= 69 && avg >= 60){
			grade = 'D';
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		String stdNum = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		int java = 0;
		int sum = 0;
		double avg = 0;
		
		Scanner keyBoard = new Scanner(System.in);
		
		System.out.print("�й��� �Է��ϼ��� : ");
		stdNum = keyBoard.nextLine();
		System.out.print("���� ������ �Է��ϼ��� : ");
		kor = keyBoard.nextInt();
		while(kor > 100 || kor < 0) {
			System.out.print("������ �߸� �Ǿ����ϴ�. �ٽ��Է� �ϼ��� : ");
			kor = keyBoard.nextInt();
		}
		System.out.print("���� ������ �Է��ϼ��� : ");
		math = keyBoard.nextInt();
		while(math > 100 || math < 0) {
			System.out.print("������ �߸� �Ǿ����ϴ�. �ٽ��Է� �ϼ��� : ");
			math = keyBoard.nextInt();
		}
		System.out.print("���� ������ �Է��ϼ��� : ");
		eng = keyBoard.nextInt();
		while(eng > 100 || eng < 0) {
			System.out.print("������ �߸� �Ǿ����ϴ�. �ٽ��Է� �ϼ��� : ");
			eng = keyBoard.nextInt();
		}
		System.out.print("�ڹ� ������ �Է��ϼ��� : ");
		java = keyBoard.nextInt();
		while(java > 100 || java < 0) {
			System.out.print("������ �߸� �Ǿ����ϴ�. �ٽ��Է� �ϼ��� : ");
			java = keyBoard.nextInt();
		}
		
		/*�̰��� ���α׷��� �ϼ��Ͻʽÿ�.*/
		sum = kor + math + eng + java;
		avg = (double)sum/4;
		
		BufferedWriter bw = null;
		try {
		bw = new BufferedWriter(new FileWriter("grade.txt"));
		
		bw.write("--------------------------\n");
		bw.write("�й� : "+stdNum+"\n");
		bw.write("--------------------------\n");
		bw.write("���� : "+kor+"\n");
		bw.write("���� : "+math+"\n");
		bw.write("���� : "+eng+"\n");
		bw.write("�ڹ� : "+java+"\n");
		bw.write("--------------------------\n");
		bw.write("���� : "+sum+"\n");
		bw.write("��� : "+avg+"\n");
		bw.write("���� : "+Prob31.CheckGrade(avg)+"\n");
		bw.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw == null) {
				try {bw.close();}catch(Exception e) { }
			}
		}
		
	}
}
