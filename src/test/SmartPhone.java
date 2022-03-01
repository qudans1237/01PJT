package test;

public class SmartPhone extends CellPhone {

	private Boolean isMonthlyFixedRate=true; //�����׿������
	private int monthlyFixedFee; //�����׿�
	
	public SmartPhone() {
	}

	public SmartPhone(String phoneNumber,int monthlyFixedFee,Boolean isMonthlyFixedRate, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}

	public Boolean getIsMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}

	public void setIsMonthlyFixedRate(Boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}

	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	public void calculateTotalFee() {
		
	}

}
