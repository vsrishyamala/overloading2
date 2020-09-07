package com.over2;

public class Circle extends Shape {
	private double radius;
	public Circle(double area,double radius)
	{
		super(area);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void computeArea()
	{
		area=(22/7)*(radius*radius);
		System.out.println("Area of circle :"+area);
		
	}

}
