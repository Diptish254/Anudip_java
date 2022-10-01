package com.calculate;

public class ShapeMain {
public static void main(String[] args) {
	Area a=new Area();               // create object  to area class
	
	System.out.println(a.RectangleArea(50,10));          // sop & set the value of rectangle 
	System.out.println(a.CircleArea(2));                    // sop & set the value of circle 
	System.out.println(a.SquareArea(6));                 // sop & set the value of Square 

}

}