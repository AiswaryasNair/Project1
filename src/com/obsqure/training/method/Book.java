package com.obsqure.training.method;

public class Book {

	String bookName;
	int price;
	Author details;
	
	
	public Book(String bookName, int price, Author details) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.details = details;
	}

	public void display() {
		
		System.out.println("Book name:"+bookName);
		System.out.println("Price:"+price);
		System.out.println(details.authorName+" "+details.age+" "+details.place);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj = new Author("Arjun",25,"xyz");
		Book objone =new Book("My Story",250,obj);
		objone.display();

	}

}
