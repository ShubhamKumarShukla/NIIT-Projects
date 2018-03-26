/*
 *  QUESTION 4
 *  A java program to check if a name is palindrome.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.util.Scanner;

class Palin			
{
	String str; char []temp; int i,j, flag=1;
	Scanner input = new Scanner(System.in);
	
	void check()
	{
		System.out.print("\n Enter the string to check for palindrome :  ");
		str=input.next();
		temp = str.toCharArray();

			for(i=0,j=temp.length-1;i<(temp.length/2);i++,j--)
			{
				if(temp[i]!=temp[j])
				{
					flag=0;
					break;
				}
			}
		
		if(flag==1)
			System.out.println("\n The string is palindrome.");
		else
			System.out.println("\n The string is not a plaindrome.");
	}
}

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Palin p = new Palin();
		p.check();
	}

}
