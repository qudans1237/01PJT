package test;

public class Rectangular extends Shape {
	public Rectangular() {
	}

	private double width;
	private double hight;

	Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	public void calculationArea() {
		area = width * hight;
	}
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
}
