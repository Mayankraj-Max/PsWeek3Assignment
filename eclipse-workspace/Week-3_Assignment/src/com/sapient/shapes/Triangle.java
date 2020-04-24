package com.sapient.shapes;

public class Triangle {

    private int sides;
	
	public Triangle(int side){
		this.sides = side;
	}
	
	public void calculateArea() {
		
		System.out.println("The Area of the Triangle is " + 0.433 * sides * sides);
	}
	
}
