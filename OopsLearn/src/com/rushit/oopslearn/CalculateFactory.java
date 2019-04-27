package com.rushit.oopslearn;

public class CalculateFactory {
	
	public Calculate getCalculation(String type) {
		Calculate obj = null;
		if(type.toLowerCase().equals("Add")) {
			obj = new Add();
		}
		return obj;
	}
}
