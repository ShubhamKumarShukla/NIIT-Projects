/*
 *  QUESTION 6
 *  A java program to find factorial of number in Java using iteration.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.util.Scanner;

class Fact
{
	int num,facto=1,i;
	Scanner input = new Scanner(System.in);
	
	void fcheck()
	{
		System.out.print("\n Enter the number to generate facorial :  ");
		num = input.nextInt();
		
		for(i=num;i>0;i--)
	        facto*=i;

	   System.out.printf("The factorial of %d is %d",num,facto);
	}
}

public class Factorial 
{

	public static void main(String[] args) 
	{
		Fact f = new Fact();
		f.fcheck();
	}

}
