package test;

public class User {
	///Field
	private String name;
	private String address;
	private String cellularNumber;
	private boolean male;
	
	///Constructor
	public User() {
		super();
	}
	public User(String name, String address, String cellularNumber, boolean male) {
		super();
		this.name = name;
		this.address = address;
		this.cellularNumber = cellularNumber;
		this.male = male;
	}
	//Method
	

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCellularNumber() {
		return cellularNumber;
	}
	public boolean isMale() {
		return male;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCellularNumber(String cellularNumber) {
		this.cellularNumber = cellularNumber;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	@Override
	public String toString() {
		return ":: �̸� : " + name + 
				", �ڵ��� : " + cellularNumber +
				", ���� : " + (male ? "��" : "��")+
				", �ּ� : " + address;
	}
	
	
	
	
	
	
}
