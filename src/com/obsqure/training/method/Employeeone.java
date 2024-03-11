package com.obsqure.training.method;

public class Employeeone {

	String empName;
	int empId;
	Car details;
	Bike info;
	
	public Employeeone(String empName, int empId, Car details, Bike info) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.details = details;
		this.info = info;
	}

	public void display() {
		System.out.println("Enployee name: "+empName);
		System.out.println("Employee id:"+empId);
		System.out.println(details.color+" "+details.carName+" "+details.regNo);
		System.out.println(info.bikeName+" "+info.regNo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj =new Car("Red","Swift",2255);
		Bike objtwo=new Bike("Duke",8977);
		Employeeone objone=new Employeeone("Rony",5678,obj,objtwo);
		objone.display();

	}

}
