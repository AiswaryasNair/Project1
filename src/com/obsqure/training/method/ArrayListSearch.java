//5. Write a Java program to search an element in an array list. 
package com.obsqure.training.method;

import java.util.ArrayList;

public class ArrayListSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Yellow");
		list.add("Blue");
		System.out.println("Elements:"+list);
		list.set(1, "t");
		System.out.println("Elements:"+list);
		if(list.contains("Yellow")) {
			System.out.println("The list contains yellow");
		}else {
			System.out.println("The list not contains yellow");
		}
	}

}
