package test;

public class Account {

	String accNo;
	int balance;
	
	public Account(){
	}
	
	public Account(String str){
		accNo=str;
		System.out.println(accNo+"계좌가 개설되었습니다.");
	}
	
	public String getAccNo(){
	
		return accNo;
	} 
	
	public int getBalance(){ 
	
		return balance;
	}
	
	public void save(int i){
		balance+=i;
		System.out.println(accNo+"계좌에 "+i+"만원이 입금되었습니다.");
	}
	
	public void deposit(int j){ 
		balance-=j;
		System.out.println(accNo+"계좌의 "+j+"만원이 출금되었습니다.");
	}



	public static void main(String[] args) throws Exception{
		
		String accNo;
		int balance;
		
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + "계좌의 잔고는 "+ balance + "만원입니다.");
		
		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo()+"계좌의 잔고"+ balance+"만원입니다.");
		
		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo+"계좌의 잔고"+ balance+"만원입니다.");
	}
}


