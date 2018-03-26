/*
 *  QUESTION 10
 *  A java program to compare the length of two arrays and display the longer array.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.io.IOException;
import java.util.Scanner;

class CheckLength
{
	int a1[], a2[], i, length1, length2;
	char ch;
	Scanner input = new Scanner(System.in);
	void inputArr() throws IOException
	{
		a1 = new int[100]; a2 = new int[100]; 
		i=0;
		
		System.out.println("\n Enter values in array 1:\n ------------------------");
		do 					   
		{
			System.out.print("\n Enter value :  ");
			a1[i] = input.nextInt();
			i++;
			System.out.print(" Do you want to enter more value : ");
			ch=(char)System.in.read();
		}while(ch=='y'||ch=='Y' && i<100);
		length1=i;
		
		i=0;
		System.out.println("\n Enter values in array 2:\n ------------------------");
		do 					   
		{
			System.out.print("\n Enter value :  ");
			a2[i] = input.nextInt();
			i++;
			System.out.print(" Do you want to enter more value : ");
			ch=(char)System.in.read();
		}while(ch=='y'||ch=='Y' && i<100);	
		length2=i;
	}
	void output()
	{
		if(length1>length2)
		{
			System.out.println("\n THE LONGER ARRAY IS ARRAY 1\n ---------------------------");
			for(i=0; i<length1;i++)
			{
				System.out.print(" "+a1[i]+" ");			
			}
		}
		else
		{
			if(length2>length1)
			{
				System.out.println("\n THE LONGER ARRAY IS ARRAY 2\n ---------------------------");
				for(i=0; i<length2;i++)
				{
					System.out.print(" "+a2[i]+" ");			
				}
			}
			else
			{
				System.out.println("\n\n THE BOTH ARRAYS ARE EQUAL\n =========================");
				System.out.println("\n THE ARRAY 1\n -----------");
				for(i=0; i<length1;i++)							   
				{
					System.out.print(" "+a1[i]+" ");			
				}
				System.out.println("\n THE ARRAY 2\n -----------");
				for(i=0; i<length2;i++)
				{
					System.out.print(" "+a2[i]+" ");			
				}
			}
		}
		
	}
	
}

public class ArrayLength 
{
	public static void main(String[] args) throws IOException 
	{
		CheckLength c = new CheckLength();
		c.inputArr();
		c.output();
	}

}
