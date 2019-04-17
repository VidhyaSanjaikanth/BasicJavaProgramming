package Assignmenthomework;

public class dowhile_adddigits {

	public static void main(String[] args) {
		// Write a programto add the digits of a number.
		int number =555;
		int sum =0;
		int remainder ;
		do 
		{
			remainder = number%10;
			sum =sum+remainder;
			number = number / 10;
		}while(number>0);
		System.out.println("The sum of the number is:"+sum);

	}

}
