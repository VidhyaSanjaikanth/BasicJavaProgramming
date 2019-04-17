package Assignmenthomework;

import java.util.Scanner;

public class for_reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int rever=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		for(;number !=0;number=number/10)
		{
			int digit = number % 10;
            rever = rever * 10 + digit;
		}
		
System.out.println("The number is:"+rever);
	}



	}


