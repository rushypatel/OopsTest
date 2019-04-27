package com.rushit.oopslearn;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
//		CalculateFactory factory = new CalculateFactory();
//		Calculate obj = factory.getCalculation("Add");
//		obj.calculate(num1, num2);
		
		Calculate obj = new Add();
		obj.calculate(num1, num2);
	}
}
