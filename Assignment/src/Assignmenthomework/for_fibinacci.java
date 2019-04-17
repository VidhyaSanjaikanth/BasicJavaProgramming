package Assignmenthomework;

import java.util.Scanner;

public class for_fibinacci {

	public static void main(String[] args) {
		//Program to print Fibonacci numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int number = sc.nextInt();
		
		int num1=0;
		int num2=1;
		int result;
		// printing number 0 and 1
		System.out.print(num1+" "+num2);
		
		for(int i=2;i<=number;i++)
		{
			result = num1+num2;
			System.out.print(" "+result);
			num1=num2;
			num2 = result;
		}
		

	}

}
