package Assignmenthomework;

public class while_sumofdigits {

	public static void main(String[] args) {
		// while loop sum of digits
		
		int number =555;
		int sum =0;
		int remainder ;
		while(number >0)
		{
			remainder = number%10;
			sum =sum+remainder;
			number = number / 10;
		}
		System.out.println("The sum of the number is:"+sum);

	}

}
