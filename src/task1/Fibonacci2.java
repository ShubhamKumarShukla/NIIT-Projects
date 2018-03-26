/*
 * QUESTION 3.2
 * A java program to display the Fibonacci series till less than 200 using only 2 variables.
 * I have achieved this using java.math.BigInteger;
 * 
 * CREATED BY - SHUBHAM KUMAR SHUKLA
 * 
 */
package task1;

import java.math.BigInteger;
import java.util.Scanner;

class Fibo2
{
	BigInteger n1 = BigInteger.valueOf(0), n2 = BigInteger.valueOf(1);
	Scanner input = new Scanner(System.in);
	
	void output()
	{
		System.out.print("\n\t FIBONACCI SEQUENCE\n\t ------------------\n Enter range (Number should be greater than 2 and less than 100) : ");
		int n=input.nextInt();   
		if(n>2 && n<=200)
		{
			System.out.printf(" %d , %d",n1,n2);
		      for(int i=3;i<=n;i++)
		      {
		    	  System.out.print(" , "+(n1.add(n2)));
		    	  n2=(n2.add(n1));
		    	  n1=(n2.subtract(n1));	    	     	  
		      }
		}
		else
			System.out.println("\n Please, enter the number in the said range!!!");
	}
}

public class Fibonacci2 
{
	public static void main(String[] args) 
	{
		Fibo2  f = new Fibo2();
		f.output();
	}
}
