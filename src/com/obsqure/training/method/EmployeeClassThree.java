package com.obsqure.training.method;

public class EmployeeClassThree extends EmployeeClassTwo {
	double deduction = super.deductionamt();
	double bonus = super.bonusamt();
	double hraamt = super.hra();
	double pfamt = super.pf();
	
	public void totalamount() {		
		double totalsalary =basicPay+hraamt-pfamt-deduction+bonus;
		System.out.println("Total salary is: "+totalsalary);
		System.out.println("\n Salary Slip:");
		System.out.println("------------------------");
		System.out.println("Basic pay:"+basicPay);
		System.out.println("Deduction :"+deduction);
		System.out.println("HRA :"+hraamt);
		System.out.println("PF :"+pfamt);
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary by hand :"+totalsalary);
		
	}
	public static void main(String[] args) {
		 
		EmployeeClassThree a=new EmployeeClassThree();
		a.totalamount();

	}

}
