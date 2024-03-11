package com.obsqure.training.method;

import java.util.Scanner;

public class EmployeeClassOne {
	Scanner sc=new Scanner(System.in);
	
	public double basicpayamt() {	
		System.out.println("Enter Basic Pay: ");
		double basicpay=sc.nextDouble();
		return basicpay;
	}
	public double deductionamt() {
		System.out.println("Enter Deduction: ");
		double deduction=sc.nextDouble();
	return deduction;
	}
	public double bonusamt(){
		System.out.println("Enter Bonus: ");
		double bonus=sc.nextDouble();
		return bonus;
	}

}
