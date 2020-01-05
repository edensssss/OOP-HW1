//Name: Eden Schwartz
//ID: 315685461
//HW1

package HW1_EdenSchwartz;

public class Rect extends Shape {
	
	private int width;
	private int height;
	
	public Rect(String color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Rect, " + super.color + ", " + width + ", " + height + ", " + "area = " + getArea();
	}
}
