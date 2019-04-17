package Assignmenthomework;

import java.util.Scanner;

public class forloop_sumof_digits {

	public static void main(String[] args) {
		// for loop sum of digits
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int r1;
		int sum;
		
		for(sum =0;number >0;sum+=number%10,number/=10);
		System.out.println(sum);
		
	
		

	}

}
