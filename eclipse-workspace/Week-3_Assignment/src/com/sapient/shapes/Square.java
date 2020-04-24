package com.sapient.shapes;

public class Square {

	 private int sides;
		
		public Square(int side){
			this.sides = side;
		}
		
		public void calculateArea() {
			
			System.out.println("The Area of the Square is " + sides * sides);
		}
	
}
