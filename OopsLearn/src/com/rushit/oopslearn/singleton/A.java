package com.rushit.oopslearn.singleton;

public class A {  
	 private static A obj;  
	 private A(){}  
	   
	 public static A getA(){  
	   if (obj == null){  
	      synchronized(A.class){  
	        if (obj == null){  
	            obj = new A();//instance will be created at request time  
	        }  
	    }              
	    }  
	  return obj;  
	 }  
	  
	 public static void printClassName(){  
	 //write your code  
		 System.out.println(">>>>>>>>>>>>>>>"+getA().getClass().getSimpleName());
	 }  
	 
	 public static void main(String args[]) {
		 printClassName();
	 }
}
