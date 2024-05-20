package com.obsqure.training.method;

public class NewClass {

	public int doubleOfNumber(int number)
	{
			int doublenum=2*number;
	        return doublenum;
	    }

	    public static void main(String[] args) {
	    	
	    	NewClass obj1=new NewClass();
	    	int result=obj1.doubleOfNumber(2);
	    	System.out.println(result);
		
		
	}

}
