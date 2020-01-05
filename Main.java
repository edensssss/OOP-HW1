//Name: Eden Schwartz
//ID: 315685461
//HW1

package HW1_EdenSchwartz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		Shape[] shapes = { new Circle(),
				new Triangle("red", 10, 20),
				new Rect("blue", 3, 5), 
				new Circle("yellow", 100),
				new Triangle("red", 1, 2), 
				new Rect("white", 6, 2) };
		
		scanner.close();

		System.out.println("\nOriginal array and areas:\n==========================\n");
		showArray(shapes);

		System.out.println("\nafter sorting:\n==========================");
		sortArray(shapes);
		showArray(shapes);
	}

	public static void showArray(Shape[] shapes) {
		for (Shape shape : shapes)
			System.out.println(shape);
	}

	private static void sortArray(Shape[] shapes) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int index = 0; index < shapes.length - 1; index++) {
				if (shapes[index].getArea() > shapes[index + 1].getArea()) {
					Shape temp = shapes[index];
					shapes[index] = shapes[index + 1];
					shapes[index + 1] = temp;
					sorted = false;
				}
			}
		}
	}
}