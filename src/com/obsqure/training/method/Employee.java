/*Create a class Car with data members:  color,carName,regNo. Create another class Employee with 
empName,empId and Car. Print employee details. */

package com.obsqure.training.method;

public class Employee {
	String empName;
	int empId;
	Car details;
	
	
	public Employee(String empName, int empId, Car details) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.details = details;
	}

	public void display() {
		System.out.println("Enployee name: "+empName);
		System.out.println("Employee id:"+empId);
		System.out.println(details.color+" "+details.carName+" "+details.regNo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj =new Car("Red","Swift",2255);
		Employee objone=new Employee("Rony",5678,obj);
		objone.display();

	}

}
