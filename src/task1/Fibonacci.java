/*
 * QUESTION 3.1
 * A java program to display the Fibonacci series till less than 200 using only 2 variables.
 * I have avoided numbers beyond 100 because then the numbers go out of range from long's range.
 * 
 * CREATED BY - SHUBHAM KUMAR SHUKLA
 * 
 */

package task1;

import java.util.Scanner;

class Fibo
{
	long n1=0, n2=1;
	Scanner input = new Scanner(System.in);
	
	void output()
	{
		System.out.print("\n\t FIBONACCI SEQUENCE\n\t ------------------\n Enter range (Number should be greater than 2 and less than 100) : ");
		int n=input.nextInt();   
		if(n>2 && n<100)
		{
			System.out.printf(" %d , %d",n1,n2);
		      for(int i=3;i<=n;i++)
		      {
		    	  System.out.print(" , "+(n1+n2));
		    	  n2=(n2+n1);
		    	  n1=(n2-n1);	    	     	  
		      }
		}
		else
			System.out.println("\n Please, enter the number in the said range!!!");
	}
}

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Fibo  f = new Fibo();
		f.output();
	}
}
