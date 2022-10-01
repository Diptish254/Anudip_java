package com.calculate;

public class Area implements Shape{    // area class to claculate the area implements the shape 
	
  // method override
	@Override
	public int RectangleArea(int length, int breadth) {         //method for rectangle 
		System.out.println("Area of Rectangle");
		return length*breadth;            // return the area  of rectangle 
	}


	@Override
	public int CircleArea(int radius) {                         //method for Circle
		System.out.println("Area of Circle");
		return (22/7)*radius*2;                            // return the area of circle 
	}


	@Override 
	public int SquareArea(int side) {            // method for area of square
		System.out.println("Area of Square");
		return side*side;                            //return the area of square
	
		
	}
	
}	