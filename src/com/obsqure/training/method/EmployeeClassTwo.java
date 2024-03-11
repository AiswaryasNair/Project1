package com.obsqure.training.method;

public class EmployeeClassTwo extends EmployeeClassOne {
	double basicPay = super.basicpayamt();
	public double hra() {
		
        double hraPercentage = 5; 
        double hra = (hraPercentage / 100) * basicPay;

        System.out.println("HRA: " + hra);
        return hra;
	}
	public double pf() {
	        double pfPercentage = 20;
	        double pf = (pfPercentage / 100) * basicPay;
	        System.out.println("PF: " + pf);
	        return pf;
	}

}
