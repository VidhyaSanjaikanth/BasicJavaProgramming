package Assignmenthomework;

public class dowhile_fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 =0;
		int number2 =1;
		int number3,limit = 10;
		
		System.out.print(number1+" "+number2);
		int i=2;
		do 
		{
			number3= number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
			i++;
		}while(i<limit);
	}

}
