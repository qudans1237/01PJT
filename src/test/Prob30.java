package test;

import java.util.Vector;

public class Prob30 {

	public static void main(String[] args) throws Exception{
		//��(����)������ ���� FileName ����
		String pathName = "./src/data.txt";
		
		
		//data.txt ���� ���
		FileUtil.fileToPrint(pathName);
		
		System.out.println("==================");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		Vector<User> vector = FileUtil.fileFindAddress(pathName, "����");
		for(int i=0; i<vector.size(); i++) {
			/////////////////�Ʒ��� �����ϼ���.////////////////////
			System.out.println(vector.get(i)); 
		}
		
		System.out.println("==================");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "����");
		for(int i=0; i<vector.size(); i++) {
			/////////////////�Ʒ��� �����ϼ���.////////////////////
			System.out.println(vector.get(i));
		}
		
		System.out.println("==================");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "��⵵");
		for(int i=0; i<vector.size(); i++) {
			/////////////////�Ʒ��� �����ϼ���.////////////////////
			System.out.println(vector.get(i));
		}
	}

}
