package Assignmenthomework;

public class while_tableof10 {

	public static void main(String[] args) {
		// Write a program to generate tables of 10.
		System.out.println("******multiplication table of 10******");
		int number = 10;
		int result;
		int i=1;
		
		while(i<=number)
		
		{
			result = 10*i;
			 System.out.println(number +" "+"*"+" "+i+" "+"="+" "+result);
			 i++;
		}
		

	}

}
