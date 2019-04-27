package com.rushit.oopslearn;

public class Add implements Calculate {

	@Override
	public void calculate(double num1, double num2) {
		// TODO Auto-generated method stub
		System.out.println("a + b is =" + (num1+num2));
	}

}
