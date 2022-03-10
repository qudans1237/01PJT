package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Grade {

		public void printGrade(String fileName)throws Exception{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String[] str;
			String read = "";
			int count = 0;
			int sum = 0;
			double avg = 0.0;
			while(true) {
				read = br.readLine();
				if(read == null) {
					avg = (double)sum / count;
					System.out.println("����� ������ "+sum+"�� �Դϴ�.");
					System.out.println("����� ����� "+avg+"�� �Դϴ�.");
				}
				str = read.split(",");
				sum += Integer.parseInt(str[1]);
				System.out.println(str[0]+"�� ������ "+str[1]+"�� �Դϴ�.");
				count++;
			}
		}
	
	public static void main(String[] args) throws Exception {
		Grade grade = new Grade();
		String fileName = "score.txt";
		try {
		grade.printGrade(fileName);
		}catch(NullPointerException en) {
			en.printStackTrace();
		}
		
	}

}
