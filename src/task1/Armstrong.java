/*
 *  QUESTION 5
 *  A java program to check if a number is Armstrong number or not.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.util.Scanner;

class Arms
{

	int num, num2, j, arm=0;
	Scanner input = new Scanner(System.in);
	
	void check()
	{
		System.out.print("\n Enter a number to check for Armstrong Number :  ");
		num = input.nextInt();
		num2=num;
		do
		{
			j=num2%10;
			arm+=j*j*j;
			num2/=10;
	    }while(num2>0);
		
	   if(arm==num)
	       System.out.print("\n Number is armstrong");
	}
	
}

public class Armstrong 
{

	public static void main(String[] args)
	{
		Arms a = new Arms();
		a.check();
	}

}
