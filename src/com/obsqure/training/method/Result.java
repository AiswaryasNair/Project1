package com.obsqure.training.method;

public class Result extends AdditionOfTwoNumbers{

	public  boolean isDivisibleBy10(int num1, int num2) {
	        int result = super.add(num1, num2);
	        if (result % 10 == 0) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	
	    public static void main(String[] args) {
	        int number1 = 30;
	        int number2 = 120;

	        Result checker = new Result();
	        int sum = checker.add(number1, number2);
	        boolean isDivisible = checker.isDivisibleBy10(number1, number2);

	        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);
	        if (isDivisible) {
	            System.out.println("The sum is divisible by 10.");
	        } else {
	            System.out.println("The sum is not divisible by 10.");
	        }
	    }
	}

