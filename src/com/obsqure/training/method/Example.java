package com.obsqure.training.method;

public class Example implements Interface1, Interface2 {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name: Arjun");
	}

	@Override
	public void address() {
		// TODO Auto-generated method stub

		System.out.println("Address: XYZ");
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("Age : 28");

	}
	public static void main(String args[]) {
		Example e=new Example();
		e.name();
		e.address();
		e.age();
	}

}
