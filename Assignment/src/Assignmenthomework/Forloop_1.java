package Assignmenthomework;

import java.util.Scanner;

public class Forloop_1 {

	public static void main(String[] args) {
		//Write a program to print 10 even numbers and 10 odd numbers.
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Eneter the limit:");
		int n= s1.nextInt();
		
		/*for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			System.out.println("Entered number is even:"+i);
			}
			else
			{
				System.out.println("Entered number is Odd:"+i);
			}
			
		}*/
		
		//other way
		//loop for even numbers
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			System.out.println("Entered number is even:"+i);
			}
		}
		
		//loop for odd numbers
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
			System.out.println("Entered number is Odd:"+i);
			}
		}
		
		
		}
	}


