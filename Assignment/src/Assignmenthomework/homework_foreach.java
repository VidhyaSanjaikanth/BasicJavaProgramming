package Assignmenthomework;

public class homework_foreach {

	public static void main(String[] args) {
		//Home work foreach example
		
		int array1[] = {1,2,3,4,5};
		
		int size = array1.length;
		System.out.println("The size of the array is:"+size);
		
		for(int j:array1)
		{
			System.out.println("The numbers are:"+j);
		}
		

	}

}
