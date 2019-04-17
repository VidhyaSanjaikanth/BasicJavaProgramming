package Assignmenthomework;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// Write a program to find factorial ofa number.
		
		//Reading user input
		Scanner s1 = new Scanner(System.in);
		System.out.println("Eneter a number:");
		int number = s1.nextInt();
		
		int f1= 1;
		for(int i=1;i<=number;i++)
		{
		f1= f1*i;
		}
		System.out.println("Factorial of "+number+" " +"is:"+f1);
	}

}
