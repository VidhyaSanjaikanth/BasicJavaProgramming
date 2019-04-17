package Assignmenthomework;

public class fibo_numbers {

	public static void main(String[] args) {
	 //Write a program to generate 10 Fibonacci numbers.
		
		 int limit = 10, 
				 previousNumber = 0,
				 nextNumber = 1;
	      

	        int i=1;
	        while(i <=limit)
	        {
	        	System.out.print(previousNumber+" ");
	            int number = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = number;
	        
	            i++;
	        }

	}

}

