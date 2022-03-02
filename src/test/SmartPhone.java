package test;

public class SmartPhone extends CellPhone {

	private boolean monthlyFixedRate = false;
	private int monthlyFixedFee = 0;

	public SmartPhone() {
		super();
	}

	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean monthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.monthlyFixedRate = monthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}

	public boolean isMonthlyFixedRate() {
		return monthlyFixedRate;
	}

	public void setMonthlyFixedRate(boolean monthlyFixedRate) {
		this.monthlyFixedRate = monthlyFixedRate;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}

	public void setMonthlyFixedFee(int monhlyFixedFee) {
		this.monthlyFixedFee = monhlyFixedFee;
	}

	public void calculationTotalFee() {
		if(monthlyFixedRate) {
			totalFee = monthlyFixedFee;
		} else {
			super.calculationTotalFee();
		}
	}
}