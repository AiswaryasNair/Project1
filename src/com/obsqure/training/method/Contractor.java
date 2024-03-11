package com.obsqure.training.method;

public class Contractor extends employeetwo {
	double salary;
	@Override
	void calculateSalary(double paymentperhour,double workinghours) {
		// TODO Auto-generated method stub
		salary=paymentperhour*workinghours;
	}
	
}
