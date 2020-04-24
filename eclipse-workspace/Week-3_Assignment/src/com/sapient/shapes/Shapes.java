package com.sapient.shapes;

public class Shapes {

	void calculateShapeArea(int numberOfSides , int sideLength) {
		
		switch(numberOfSides) {
		
		case 1: Circle obj1 = new Circle(sideLength);
		        obj1.calculateArea();
		        break;
		case 3: Triangle obj2 = new Triangle(sideLength);
                obj2.calculateArea();
                break; 
		case 4: Square obj3 = new Square(sideLength);
                obj3.calculateArea();
                 break;  
        default:System.out.println("No Shapes Present");         
		
		}
		
	}
	
	public static void main(String[] args) {
	    
		Shapes obj = new Shapes();
        obj.calculateShapeArea(3,8);
	  
	}

}
