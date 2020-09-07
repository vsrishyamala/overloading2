package com.over2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n;
		double radius,length,bre,base,heg;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the shape");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        n=s.nextInt();
        if(n==1)
        {
        	System.out.println("Enter the radius");
        	radius=s.nextDouble();
        	Circle c= new Circle(0.0, radius);
        	c.computeArea();
        }
        else if(n==2)
        {
        	System.out.println("Enter length and breadth");
        	length=s.nextDouble();
        	bre=s.nextDouble();
        	Rectangle r= new Rectangle(0.0,length,bre);
        	r.computeArea();
        	
        }
        else
        {
        	System.out.println("Enter base and height");
        	base=s.nextDouble();
        	heg=s.nextDouble();
        	Triangle t= new Triangle(0.0,base,heg);
        	t.computeArea();
        }
	}

}
