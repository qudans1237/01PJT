package test;

public class CellPhone {

	private String phoneNumber=null;
	private int totalCallTime=0;
	private int totalFee = 0;
	private int feePerCallTime = 0;
	
	public CellPhone() {	
	}
	public CellPhone(String phoneNumber,int feePerCallTime ) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalCallTIme() {
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

	public void call(String phoneNumber,int totalCallTime) {
		
	}
	
	public void calculateTotalFee() {
		
	}
	
	
}
