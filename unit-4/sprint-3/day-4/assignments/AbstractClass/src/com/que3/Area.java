package com.que3;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		int areaOfRectangle = length * breadth;
		return areaOfRectangle;
	}

	@Override
	public int squareArea(int side) {
		int areaOfSquare = side * side;
		return areaOfSquare;
	}

	@Override
	public int circleArea(int radius) {
		double areaOfCircle = 3.14 * radius * radius;
		return (int) areaOfCircle;
	}

}
