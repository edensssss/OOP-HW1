//Name: Eden Schwartz
//ID: 315685461
//HW1

package HW1_EdenSchwartz;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return base * height / 2 ;
	}
	
	@Override
	public String toString() {
		return "Triangle, " + super.color + ", " + base + ", " + height + ", " + "area = " + getArea();
	}
}
