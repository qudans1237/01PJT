package test;

public class Prob18 {
	
	
	
	
	
	
	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone("010-010-010",1000);
		
		cellPhone.call("017-017-017",10);
		cellPhone.call("016-016-016",10);
		cellPhone.calculateTotalFee();
		System.out.println(cellPhone.getPhoneNumber()+"�� ��ȭ�ð���"+cellPhone.getTotalCallTiome()+"�̸� \n" 
		+"�ܰ�"+ cellPhone.getFeePerCallTime()+"�� �����"+cellPhone.getTotalFee()+"�� �Դϴ�.");
	
		System.out.println("============================================");
		
		SmartPhone smartPhone = new SmartPhone("000-000-000",200);
		smartPhone.cell("017-017-017",10);
		smartPhone.calculateTotalFee();
		System.out.println(smartPhone.getPhoneNumber()+"�� ��ȭ�ð���"+smartPhone.getTotalCallTiome()+"�̸� \n" 
				+"�ܰ�"+ smartPhone.getFeePerCallTime()+"�� �����"+smartPhone.getTotalFee()+"�� �Դϴ�.");
	
		System.out.println("============================================");
		
		SmartPhone smartPhone01 = new SmartPhone("111-111-111",0,ture,3000);
		smartPhone01.cell("017-017-017",10);
		smartPhone01.cell("016-016-016",10);
		smartPhone01.calculateTotalFee();
		
		System.out.println(smartPhone01.getPhoneNumber()+"�� ��ȭ�ð���"+smartPhone01.getTotalCallTiome()+"�̸� \n" 
				+"�ܰ�"+ smartPhone01.getFeePerCallTime()+"�� �����"+smartPhone01.getTotalFee()+"�� �Դϴ�.");
	}
}
