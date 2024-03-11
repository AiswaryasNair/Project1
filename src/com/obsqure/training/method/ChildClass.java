package com.obsqure.training.method;

public class ChildClass extends ParentClass {

	public void display() {
		super.display();
		System.out.println("This is child class");
	}
	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
		  ChildClass ch =new ChildClass();
		  ch.display();
	  }
	 

}
