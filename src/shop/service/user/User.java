package shop.service.user;

public class User {

	private String name;
	String add;
	protected boolean gender;
	public String hp;
	public static final String nationality = "¥Î«—πŒ±π";
	
	
	public User() {}


	public User(String name, String add, boolean gender, String hp) {
		super();
		this.name = name;
		this.add = add;
		this.gender = gender;
		this.hp = hp;
	}


	public String getName() {
		return name;
	}


	public String getAdd() {
		return add;
	}


	public boolean isGender() {
		return gender;
	}


	public String getHp() {
		return hp;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String toString() {
		return "Client [name=" + name + ", add=" + add + ", gender=" + gender + ", hp=" + hp + "]";
	}

}
