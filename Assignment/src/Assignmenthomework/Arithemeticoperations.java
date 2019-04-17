package Assignmenthomework;

import java.util.Scanner;

public class Arithemeticoperations {

	public static void main(String[] args) {
		
		//1,int -> adding two numbers 
		 System.out.println("********ADDITION*********");
		   int a1=10;
		   int a2=20;
		   int r1= a1+a2;
		   System.out.println("Result: "+r1);
	
		//2,byte-> Subtracting two numbers
		   System.out.println("********SUBTRACTION*********");
		     byte b1=10 , b2=20;
		     byte r2 =(byte) ((byte)b2-b1);
		     System.out.println("Result: "+r2);
		     
	   //3, long-> multiply two numbers && scanner
		     System.out.println("********MULTIPLICATION*********");
		    Scanner in = new Scanner(System.in);
		    System.out.print("Eneter first long number:");
		    long l1= in.nextLong();
		    System.out.print("Eneter second long number:");
		    long l2=in.nextLong();
		    long r3=l1*l2;
		    System.out.println("Result:"+r3);
		    
   		    
	//4, float-> divide two numbers
		    System.out.println("********DIVITION*********");
		    Scanner f1 = new Scanner(System.in);
		    System.out.print("Eneter first float number:");
		    float f2=f1.nextFloat();
		    System.out.print("Eneter second float number:");
		    float f4= f1.nextFloat();
		    float f3=f2/f4;
		    System.out.println("Result:"+f3);
		  
	//increment operator ++	     
		    System.out.println("********INCREMENT*********");
		    int a= 10 ;
		    a++;
		    System.out.println("The result is:"+a);
		
   //Decrement operator 
		    System.out.println("********DECREMENT*********");
		    int b= 20;
		    b--;
		    System.out.println("The result is:"+b);
   		

	}

}
