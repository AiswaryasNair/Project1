package com.obsqure.training.method;

import java.util.Scanner;

public class Rectangle implements Polygon {

	@Override
	public void getArea(float length,float breadth) {
		// TODO Auto-generated method stub
		float area=length*breadth;
		System.out.println("Area of rectancle is:"+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float l= sc.nextFloat();
		float b= sc.nextFloat();
		Rectangle r=new Rectangle();
		r.getArea(l, b);
		
	}

}
