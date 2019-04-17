package Assignmenthomework;

public class while_fiban {

	public static void main(String[] args) {
		// Program to print Fibonacci numbers
		
		int number1 =0;
		int number2 =1;
		int number3,limit = 10;
		
		System.out.print(number1+" "+number2);
		int i=2;
		while(i<limit)
		{
			number3= number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
			i++;
		}
		

	}

}
