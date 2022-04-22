package za.ac.wsu.s220529973;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Circle s1 = new Circle();
	
	s1.getRadius();
	s1.getY();
	s1.getX();

	System.out.println("The radius is: "+s1.getRadius());
	System.out.println("Y is: "+s1.getY());
	System.out.println("X is: "+s1.getX());
	
	s1.calculateArea();
	s1.calculateCircumference();
	s1.calculateDiameter();
	
	}
	
}