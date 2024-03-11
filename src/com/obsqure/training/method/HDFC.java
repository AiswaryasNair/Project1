package com.obsqure.training.method;

import java.util.Scanner;

public class HDFC implements RBI {

	@Override
	public void recurringDeposit(double amount, int duration) {
		// TODO Auto-generated method stub
		double interestRate = getInterestRate();
        double totalAmount = amount * (1 + interestRate * duration);

        // Display the result
        System.out.println("Total amount after " + duration + " period(s) of time: " + totalAmount);
	}
	
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0.065; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HDFC hdfc = new HDFC();		
        double depositAmount = sc.nextDouble(); 
        int depositDuration = sc.nextInt() ;// Example duration in years
        hdfc.recurringDeposit(depositAmount, depositDuration);
		
	}

}
