package Assignmenthomework;

import java.util.Scanner;

public class while_reverse_number {

	public static void main(String[] args) {
		// while loop reverse a number
		
		int number;
		int rever=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		while(number !=0)
		{
			rever = rever * 10;
			rever = rever + number %10;
			number = number /10;
		}
		
System.out.println("The number is:"+rever);
	}

}
