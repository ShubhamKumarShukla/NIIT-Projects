/*
 *  QUESTION 2
 *  A java program to determine whether a given number by user is prime or not.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;
import java.util.Scanner;

class Primenum
{
	Scanner input = new Scanner(System.in);
	int num,i,j=0;
	
	void CheckPrime()
	{
		System.out.print("\n Enter number   :  ");
		 num=input.nextInt();
		
		if(num == 1)
		{
			System.out.println("\n 1 is neither prime nor composite");
		}
		else
		{
		  if(num==0 || num<0)
		  {
			  System.out.println("\n The number should be natural number only!!!!");
		  }
		  else 
		  {
			  for(i=2;i<=num/2;i++)
				 {
					if(num%i==0)
					{
						j++;
						break;
					}
				 }
			  if(j==0)
			  {
				  System.out.println("\n The Number is PRIME!!!");
			  }
			  else
			  {
				  System.out.println("\n The Number is NOT PRIME!!! It's a COMPOSITE NUMBER.");
			  }
		  }
		}
		 
	}
}

public class Prime {

	public static void main(String[] args) 
	{
		Primenum p = new Primenum();
		p.CheckPrime();
	}

}
