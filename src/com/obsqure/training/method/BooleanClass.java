package com.obsqure.training.method;

import java.util.Scanner;

public class BooleanClass {

	public boolean getNum(int num) {
		
		if(num%2==0) {
			return true;
		}
		else
			return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		BooleanClass obj=new BooleanClass();
	    boolean result=obj.getNum(n);
	    System.out.println(result);
	}

}
