package Assignmenthomework;

import java.util.Scanner;

public class if_else_positive_or_negative {

	public static void main(String[] args) {
	
		//Write a program to check if the number is positive ornegative
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Eneter a number:");
		
        int a= s1.nextInt();
        if(a >= 0)
        {
        	System.out.println("Entered number is a positive number");
        }
        else
        {
        	System.out.println("Entered number is a negative number");
        }
		
	}

}
