package com.epam.Design_Principles;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	    Calculator c=new Calculator();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter first number:");
	        int a=sc.nextInt();
	        System.out.println("Enter second number:");
	        int b=sc.nextInt();
	        System.out.println("1.Addition");
	        System.out.println("2.Subtraction");
	        System.out.println("3.Multiplication");
	        System.out.println("4.Division");
	        System.out.println("Enter Your Choice:");
	        int choice=sc.nextInt();
	        switch(choice){
	        case 1:c.addition(a, b);
	                break;
	        case 2:c.subtraction(a, b);
	                break;
	        case 3:c.multiplication(a, b);
	                break;
	        case 4:c.division(a, b);
	                break;
	        default:System.out.println("Invalid choice...");
	        }
    }
}
