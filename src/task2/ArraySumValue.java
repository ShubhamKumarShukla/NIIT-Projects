/*
 *  QUESTION 21
 *  A java program to find the sum values of an array.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task2;

import java.util.Scanner;

class SumValue
{
	int arr[], alength, sum=0,i;
	Scanner input = new Scanner(System.in);
	
	void arrOps()
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
		 		sum+=arr[i];
		    }
		 	
		 System.out.println("\n The Inputed Array is :\n ----------------------");
		 	for(i=0;i<alength;i++)
		 		System.out.print(" "+arr[i]+" ");
		 
		 System.out.println("\n The sum of all the values in the array is :  "+sum);
	}
}

public class ArraySumValue 
{
	public static void main(String[] args) 
	{
		SumValue s = new SumValue();
		s.arrOps();
	}

}
