package com.obsqure.training.method;

public class Bank {

	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void validate() {
		
		if(pin==1001||pin==1234||pin==1212) {
			System.out.println("pin number is valid");}
			else {
				System.out.println("Not valid");
			}
		
	}
	
}
