
//4. Write a Java program to remove the third element from an array list. 
package com.obsqure.training.method;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Orange");
		list.add("Red");
		list.add("Yellow");
		list.add("Blue");
		System.out.println("Elements:"+list);
		list.remove(3);
		System.out.println("After remove:"+list);
	}

}
