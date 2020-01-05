//Name: Eden Schwartz
//ID: 315685461
//HW1

package HW1_EdenSchwartz;

public abstract class Shape {

	protected String color;
	
	final static String[] invaldColors = {"green", "purple", "brown", "black"};
	
	public Shape(String color) {
		this.color = color;
	} 	  

	public abstract double getArea();
	
	public abstract String toString();
}
