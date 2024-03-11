package com.obsqure.training.method;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		Bank obj =new Bank();
		obj.setPin(pin);
		System.out.println("Pin number: "+obj.getPin());
		obj.validate();
	}

}
