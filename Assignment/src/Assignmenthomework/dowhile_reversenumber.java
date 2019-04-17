package Assignmenthomework;

import java.util.Scanner;

public class dowhile_reversenumber {

	public static void main(String[] args) {
		// Write a program to reverse the digits of a number.
		
		int number;
		int rever=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		do 
		{
			rever = rever * 10;
			rever = rever + number %10;
			number = number /10;
		}while(number!=0);
		
System.out.println("The number is:"+rever);
	}



	}


