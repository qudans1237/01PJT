package test;

public class CellPhone {

	protected String phoneNumber = ""; 
	protected int totalCallTime = 0;
	protected int totalFee = 0;
	protected int feePerCallTime = 0;

	public CellPhone() {
	}

	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTotalCallTime() {
		return totalCallTime;
	}

	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public int getFeePerCallTime() {
		return feePerCallTime;
	}

	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	public void call(String otherPhoneNum,int callTime) {
		totalCallTime += callTime;
		System.out.println(otherPhoneNum+" 번호로 "+callTime +" 통화함");
	}
	
	public void calculationTotalFee() {
		totalFee = totalCallTime * feePerCallTime;
	}
}
