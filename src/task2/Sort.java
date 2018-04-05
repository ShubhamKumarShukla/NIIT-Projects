/*
 *  QUESTION 20
 *  A java program to sort a numeric array and a string array.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task2;

import java.util.Scanner;

class IntSort
{
	int i,j,alength,temp,arr[];// = new int[50];
	String str[],stemp;
	Scanner input = new Scanner(System.in);
	
	void numSort()
	{
		for(i=0;i<alength-1;i++)
		{
			for(j=i+1;j<alength;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\n\n The Sorted Array is :\n ---------------------");
	 	for(i=0;i<alength;i++)
	 		System.out.print(" "+arr[i]+" ");
	}
	
	void strSort()
	{
		for(i=0;i<alength-1;i++)
		{
			for(j=i+1;j<alength;j++)
			{
				if(str[i].compareToIgnoreCase(str[j])>0)
				{
					stemp=str[i];
					str[i]=str[j];
					str[j]=stemp;
				}
			}
		}
		
		System.out.println("\n\n The Sorted Array is :\n ---------------------");
	 	for(i=0;i<alength;i++)
	 		System.out.print(" "+str[i]+" ");
	}
	
	void numInput()
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
		 
		 numSort();
	}
	
	void strInput()
	{
		 System.out.print("\n\n\n Enter the length of array you want(MAX 50) :  ");
		 alength = input.nextInt();
		 str = new String[alength];
		 
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
		 		str[i] = input.next();
		    }
		 	
		 System.out.println("\n The Inputed Array is :\n ----------------------");
		 	for(i=0;i<alength;i++)
		 		System.out.print(" "+str[i]+" ");
		 
		 strSort();
	}
}

public class Sort 
{
	public static void main(String[] args) 
	{
		IntSort is = new IntSort();
		is.numInput();
		is.strInput();
	}

}
