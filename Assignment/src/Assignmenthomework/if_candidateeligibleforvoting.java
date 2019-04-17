package Assignmenthomework;

import java.util.Scanner;

public class if_candidateeligibleforvoting {

	public static void main(String[] args) {
		// Write a program to check if a candidate is eligible for voting or not 
		
		int ageforvoting =18;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age =s1.nextInt();
		if(age > ageforvoting)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		
		

	}

}
