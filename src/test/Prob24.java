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
			System.out.println("마이너스 통장이 없습니다.");
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
				throw new Exception("잔고부족 출금불가 합니다.");
			}
		}else {
			if(!(this.blance < money)) {
				this.blance -= money;
			}else {
				throw new Exception("잔고부족 출금불가 합니다.");
			}
			
		}
		
		
	}
	
	
	@Override
	public String toString() {
		if(this.creditLine) {
			return "[계좌정보] 계좌번호 : " + this.accountNo + " 잔고 : " + this.blance +"원\t"+
		"[["+creditLineLimit+"원 마이너스 통장]]";
		}else {
			return "[계좌정보] 계좌번호 : " + this.accountNo + " 잔고 : " + this.blance +"원";

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
	//111-111-111, 마이너스통장, 마이너스 통장 한도, 잔고를 갖는 계좌 인스턴스 생성
		Account account01 = new Account("111-111-111",true,1000000,100000);
		try {
			//계좌번호, 잔고, 마이너스 통장유무 출력
			System.out.println("0.최초 계좌 상태");
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n1. "+account01.getAccountNo()+"계좌 200000 출금요청");
			account01.withdraw(200000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n2. "+account01.getAccountNo()+"계좌 100000 출금요청");
			account01.withdraw(100000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n3. "+account01.getAccountNo()+"계좌 500000 출금요청");
			account01.withdraw(500000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n4. "+account01.getAccountNo()+"계좌 600000 출금요청");
			account01.withdraw(600000);
			System.out.println("[계좌정보]"+account01);
			
		}catch(Exception e) {
			System.out.println(">>> 예외발생: "+account01.getAccountNo()+":"+e.getMessage());
		}
		System.out.println("\n=========================================");
		
		//계좌 인스턴스 생성
		Account account02 = new Account();
		try {
			account02.setAccountNo("222-222-222");
			System.out.println("0.최초 계좌 상태");
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n1. "+account02.getAccountNo()+"계좌 100000 입금요청");
			account02.deposit(100000);
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n2. "+account02.getAccountNo()+"계좌 50000 출금요청");
			account02.withdraw(50000);
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n3. "+account02.getAccountNo()+"계좌 60000 출금요청");
			account02.withdraw(60000);
			System.out.println("[계좌정보]"+account02);
		}catch(Exception e) {
			System.out.println(">>>예외발생 : "+account02.getAccountNo()+":"+e.getMessage());
		}
		

	}

}
