package com.obsqura.training.method2;

public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		if(n1>n2)
		{
			System.out.println("Largest number is"+n1);
		}
		else if(n2>n3){
			System.out.println("Largest number is"+n2);
	}else{
		System.out.println("Largest number is:"+n3);
	}

	}

}
