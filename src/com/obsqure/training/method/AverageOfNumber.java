package com.obsqure.training.method;

import java.util.Scanner;

public class AverageOfNumber {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	public void AverageOfNumbers(float f1, float f2, float f3) {
		double averageFloat = (f1 + f2 + f3) / 3;
		System.out.println("Average of float numbers: " + averageFloat);
	}

	public void AverageOfNumbers() {
		int averageInt = (a + b + c) / 3;
		System.out.println("Average of integer numbers: " + averageInt);
	}

	public static void main(String args[]) {
		AverageOfNumber v=new AverageOfNumber();
		v.AverageOfNumbers(23.7f, 30.5f, 67.9f);
		v.AverageOfNumbers();
	}
}