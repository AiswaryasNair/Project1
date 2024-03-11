package com.obsqure.training.method;

import java.util.Scanner;

public class FullTimeEmployee extends employeetwo {
	double salryOfFullTimeEmp;
	

	@Override
	void calculateSalary(double paymentperhour, double workinghours) {
		// TODO Auto-generated method stub
		salryOfFullTimeEmp=paymentperhour * workinghours;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		double payhr=sc.nextDouble();
		double whr=sc.nextDouble();
		Contractor c = new Contractor();
		c.calculateSalary(payhr, whr);
		System.out.println("Salary of contractor:"+c.salary);
		Scanner sc1=new Scanner(System.in);
		double payhremp=sc1.nextDouble();
		double whremp=8;
		FullTimeEmployee f=new FullTimeEmployee();
		f.calculateSalary(payhremp,whremp);
		System.out.println("Salary of Full time employee:"+f.salryOfFullTimeEmp);
	}
}
