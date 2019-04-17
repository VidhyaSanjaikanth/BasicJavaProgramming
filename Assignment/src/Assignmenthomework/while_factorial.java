package Assignmenthomework;

import java.util.Scanner;

public class while_factorial {

	public static void main(String[] args) {
		// Write a programto find factorial of a number
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number= sc.nextInt();

		int f1= 1;
		int i = 1;
		while ( i <= number)
		{
			f1 = f1 * i;
			  i++;
		}
		
		System.out.println("Factorial of a number is "+ f1);
	}
		
		

	}


