package Assignmenthomework;

public class while1 {

	public static void main(String[] args) {
		//Write a program to print 10 even numbers and 10 odd numbers

	
      int number = 50;
		
		int i=1;
		
		while(i <=number)
			
		{
			if( i % 2 == 0)
			
				System.out.print("The number is even:"+i + " ");
			
			else
				System.out.println("The number is odd:"+i);
			
			
		i++;
		}
		
	}

}
