/*
 *  QUESTION 9
 *  A java program to copy one array into another.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.util.Scanner;

class CopyArray
{
	int a1[], a2[], num, i;
	Scanner input = new Scanner(System.in);
	void inputArr()
	{
		a1 = new int[100]; a2 = new int[100];
		System.out.print("\n Enter how many values you want to enter in the array (MAX 100) :  ");
		num = input.nextInt();
		System.out.println("\n Enter values in array :\n -----------------------");
		
		for(i=0; i<num;i++)
		{
			System.out.print(" Enter the "+i+" index value :  ");
			a1[i] = input.nextInt();
		}	
		System.out.println("\n THE INPUTED ARRAY IS :\n ----------------------");
		for(i=0;i<num;i++)
			System.out.print(" "+a1[i]+" ");
							
	}
	void output()
	{
		System.out.println("\n\n THE COPIED ARRAY IS :\n ---------------------");
		for(i=0; i<num;i++)
		{
			a2[i] = a1[i];
			System.out.print(" "+a2[i]+" ");			
		}
	}
	
}

public class ArrayCopy 
{

	public static void main(String[] args) 
	{
		CopyArray a = new CopyArray();
		a.inputArr();
		a.output();
	}

}
