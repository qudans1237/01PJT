package test;


class Account{
	
	///Field
	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit;
	private int blance;
	
	///Constructor
	public Account() {
		
	}
	
	
	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}


	public Account(String accountNo, int blance) {
		super();
		this.accountNo = accountNo;
		this.blance = blance;
	}


	public Account(String accountNo, boolean creditLine, int creditLineLimit, int blance) {
		super();
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		if(creditLine) {
			this.creditLineLimit = -1 * creditLineLimit;
		}else {
			System.out.println("���̳ʽ� ������ �����ϴ�.");
		}
		this.blance = blance;
	}
	
	///Method
	public void deposit(int money) {
		this.setBlance(this.blance + money);
		// this.blance += money;
	}
	
	public void withdraw(int money) throws Exception {
		
		if(this.creditLine) {
			if(!(this.creditLineLimit > this.blance-money)) {
				this.blance -= money;
			}else {
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			}
		}else {
			if(!(this.blance < money)) {
				this.blance -= money;
			}else {
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			}
			
		}
		
		
	}
	
	
	@Override
	public String toString() {
		if(this.creditLine) {
			return "[��������] ���¹�ȣ : " + this.accountNo + " �ܰ� : " + this.blance +"��\t"+
		"[["+creditLineLimit+"�� ���̳ʽ� ����]]";
		}else {
			return "[��������] ���¹�ȣ : " + this.accountNo + " �ܰ� : " + this.blance +"��";

		}
	}


	///get/set
	public String getAccountNo() {
		return accountNo;
	}
	public boolean isCreditLine() {
		return creditLine;
	}
	public int getCreditLineLimit() {
		return creditLineLimit;
	}
	public int getBlance() {
		return blance;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}
	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}
	public void setBlance(int blance) {
		this.blance = blance;
	}
}


public class Prob24 {	
	
	public static void main(String[] args) {
	//111-111-111, ���̳ʽ�����, ���̳ʽ� ���� �ѵ�, �ܰ� ���� ���� �ν��Ͻ� ����
		Account account01 = new Account("111-111-111",true,1000000,100000);
		try {
			//���¹�ȣ, �ܰ�, ���̳ʽ� �������� ���
			System.out.println("0.���� ���� ����");
			System.out.println("[��������]"+account01);
			
			System.out.println("\n1. "+account01.getAccountNo()+"���� 200000 ��ݿ�û");
			account01.withdraw(200000);
			System.out.println("[��������]"+account01);
			
			System.out.println("\n2. "+account01.getAccountNo()+"���� 100000 ��ݿ�û");
			account01.withdraw(100000);
			System.out.println("[��������]"+account01);
			
			System.out.println("\n3. "+account01.getAccountNo()+"���� 500000 ��ݿ�û");
			account01.withdraw(500000);
			System.out.println("[��������]"+account01);
			
			System.out.println("\n4. "+account01.getAccountNo()+"���� 600000 ��ݿ�û");
			account01.withdraw(600000);
			System.out.println("[��������]"+account01);
			
		}catch(Exception e) {
			System.out.println(">>> ���ܹ߻�: "+account01.getAccountNo()+":"+e.getMessage());
		}
		System.out.println("\n=========================================");
		
		//���� �ν��Ͻ� ����
		Account account02 = new Account();
		try {
			account02.setAccountNo("222-222-222");
			System.out.println("0.���� ���� ����");
			System.out.println("[��������]"+account02);
			
			System.out.println("\n1. "+account02.getAccountNo()+"���� 100000 �Աݿ�û");
			account02.deposit(100000);
			System.out.println("[��������]"+account02);
			
			System.out.println("\n2. "+account02.getAccountNo()+"���� 50000 ��ݿ�û");
			account02.withdraw(50000);
			System.out.println("[��������]"+account02);
			
			System.out.println("\n3. "+account02.getAccountNo()+"���� 60000 ��ݿ�û");
			account02.withdraw(60000);
			System.out.println("[��������]"+account02);
		}catch(Exception e) {
			System.out.println(">>>���ܹ߻� : "+account02.getAccountNo()+":"+e.getMessage());
		}
		

	}

}
