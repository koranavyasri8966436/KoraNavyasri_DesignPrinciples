package com.epam.Design_Principles;

public class Calculator {
	void addition (int a,int b){
		System.out.println(a + " + " +b +" = "+(a+b));
	}
	void subtraction (int a,int b){
		System.out.println(a + " - " +b +" = "+(a-b));
	}

	void  multiplication(int a,int b){
		System.out.println(a + " * " +b +" = "+(a*b));
	}

	void division (float a,float b){
		if(b==0){
			System.out.println("Second number should be greater than zero");
		}
		else{
		System.out.println(a + " / " +b +" = "+(a/b));
		}
	}

}
