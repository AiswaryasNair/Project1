

//2. Write a Java program to retrieve an element (at a specified index) from a given array list.  
package com.obsqure.training.method;

import java.util.ArrayList;


public class ArrayListIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Yellow");
		String firstElement = list.get(0); // Retrieves the element at index 0

        // Print the retrieved elements
        System.out.println("First element: " + firstElement);
		
	}
	}
