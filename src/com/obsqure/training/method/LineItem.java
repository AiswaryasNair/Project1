/*2. Create a class Product with data members: id, name, and description. Create another class LineItem which 
consist of quantity and Product. Use aggregation to print the lineitem with Product. */


package com.obsqure.training.method;

public class LineItem {

	int quantity;
	Product details;
	
	public LineItem(int quantity, Product details) {
		super();
		this.quantity = quantity;
		this.details = details;
	}
	
	public void display(){
		System.out.println("quantity:"+quantity);
		System.out.println(details.id+" "+details.description+" "+details.name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj=new Product(1,"\nDescription of item one","\nPen");
		LineItem objs=new LineItem(5,obj);
		objs.display();
	}

}
