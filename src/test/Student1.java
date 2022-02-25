package test;

public class Student1 extends Person{
	
	private int id;
	
	public Student1() {
	}
	
	public Student1(String name, int age) {
		super(name, age);
	}
	public Student1(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void print() {
		System.out.print("이름: "+getName()+"나이: "+getAge()+ "학번: "+getId());
	}
}
