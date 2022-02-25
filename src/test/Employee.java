package test;

public class Employee {
	
	private String name;
	private int age;
	private String dept;
	
	public Employee() {
	}
	
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	
	public void print() {
		System.out.println("이름: "+name+ "\t나이"+age+"\t부서 :"+dept);
	}
}
