//3. Write a Java program to iterate through all elements in an array list.  

package com.obsqure.training.method;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Yellow");
		Iterator<String> l=list.iterator();
		while (l.hasNext()) {
            String element = l.next();
            System.out.println(element);
		
	}

}
}
