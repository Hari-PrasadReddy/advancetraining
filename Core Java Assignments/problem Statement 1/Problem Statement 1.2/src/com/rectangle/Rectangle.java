package com.rectangle;

import java.util.Scanner;

class Rectangle {
	int length;
	int breadth;
	int area;
	int perimeter;
	
	void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter lenth of rectangle: ");
		length = in.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		breadth =in.nextInt();
	}
	
    void calculate() {
    	area =length * breadth;
    	perimeter =2 *(length + breadth);
    }
    void dispaly() {
    	System.out.println("Area of Rectangle =" + area);
    	System.out.println("Perimeter of Rectangle = " +perimeter);
    	
    }
    
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.input();
		obj.calculate();
		obj.dispaly();
	}

}
