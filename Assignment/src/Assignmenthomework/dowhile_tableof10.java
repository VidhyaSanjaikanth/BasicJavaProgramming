package Assignmenthomework;

public class dowhile_tableof10 {

	public static void main(String[] args) {
		// Write a program to generate tables of 10
		System.out.println("******multiplication table of 10******");
		int number = 10;
		int result;
		int i=1;
		
		do
		
		{
			result = 10*i;
			 System.out.println(number +" "+"*"+" "+i+" "+"="+" "+result);
			 i++;
		}while(i<=number);

	}

}
