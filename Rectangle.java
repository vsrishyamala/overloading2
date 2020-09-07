package com.over2;

public class Rectangle extends Shape{
	private double length;
	private double breadth;
	public double area;
	public Rectangle(double area, double length, double breadth) {
		super(area);
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void computeArea()
	{
		area=(length*breadth);
		System.out.println("Area of Rectangel :"+area);
	}

}
