package com.masai;

public class Shapes {
	public void area(Circle circle) {
		int radius = circle.radius;
		double result = 3.14 * radius * radius;
		System.out.println("Area of circle " + result);
	}

	public void area(Rectangle rectangle) {
		int length = rectangle.length;
		int breadth = rectangle.breadth;
		double result = length * breadth;
		System.out.println("Area of rectangle " + result);
	}

	public void area(Square square) {
		int side = square.side;
		double result = side * side;
		System.out.println("Area of square " + result);
	}

	public static void main(String[] args) {
		Shapes allShapes = new Shapes();
		allShapes.area(new Circle());
		allShapes.area(new Rectangle());
		allShapes.area(new Square());
	}

}
