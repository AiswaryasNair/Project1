/*1. Write a program to get the details of a Student  
a. Class 1 - Student  
i. 
Get the student name and roll number  
b. Class 2- Address  
i. 
Get the address of student  
c. Print Student name, roll number with address  
d.  There is no IS-A relationship  */

package com.obsqure.training.method;

public class Address {

	String address;
	Student details;
	
	public Address(String address, Student details) {
		super();
		this.address = address;
		this.details = details;
	}
	public void display(){
		System.out.println("Address:"+address);
		System.out.println(details.name+" "+details.rollno);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj =new Student("Manu",2);
		Address objone = new Address("Houseno:567,xyz city",obj);
		objone.display();

	}

}
