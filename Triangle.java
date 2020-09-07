package com.over2;

public class Triangle extends Shape {
	private double base;
	private double height;
	public double area;
	public Triangle(double area,double base, double height) {
		super(area);
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void computeArea()
	{
		area=((base*height)/2);
		System.out.println("Area of triangle :"+area);
	}

}
