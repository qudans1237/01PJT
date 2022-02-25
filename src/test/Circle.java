package test;

public class Circle extends Shape {
	
	private double radius;

	public Circle() {
	}
	
	Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void calculationArea() {
		area = Math.PI * radius * radius;
	}
	
}
