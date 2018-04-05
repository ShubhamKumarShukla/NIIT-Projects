/*
 *  QUESTION 23
 *  A java program to reverse an array of integer values.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task2;

import java.util.Scanner;

class RevArr
{
	int arr[], alength, temp, i,j;
	Scanner input = new Scanner(System.in);
	
	void reverse()
	{
		for(i=0,j=alength-1;i<(alength/2);i++,j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println("\n The Reverse Array is :\n -----------------------");
	 	for(i=0;i<alength;i++)
	 		System.out.print(" "+arr[i]+" ");
	}
	
	void arrInput()
	{
		System.out.print("\n Enter the length of array you want(MAX 50) :  ");
		 alength = input.nextInt();
		 arr = new int[alength];
		 
		 if(alength<=0 || alength>50)
		 {
			 System.out.println("\n\n Sorry to say but you crossed the line of the Array and went to the restricted terriotry."
		    			+ "\n Hence  we have no other option but extermination to safeguard others.");
			 System.exit(0);
		 }
		 
		 System.out.println("\n Enter the values in the array:\n------------------------------");
		 	for(i=0;i<alength;i++)
		    {
		 		System.out.print(" Value "+i+" :  ");
		 		arr[i] = input.nextInt();
		    }
		 	
		 System.out.println("\n The Inputed Array is :\n ----------------------");
		 	for(i=0;i<alength;i++)
		 		System.out.print(" "+arr[i]+" ");
		 
		 reverse();
	}
}

public class RevIntArr 
{
	public static void main(String[] args) 
	{
		RevArr r = new RevArr();
		r.arrInput();
	}

}
