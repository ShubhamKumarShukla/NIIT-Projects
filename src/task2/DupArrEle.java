/*
 *  QUESTION 24
 *  A java program to find the duplicate values of an array of integer values.
 *  
 *  NOTE
 *  ----
 *  This program works for n duplicate values.
 *  Here's a sample output for better understanding.
 *  
 *   Enter the length of array you want(MAX 50) :  10
 *
 *	 Enter the values in the array:
 *	 ------------------------------
 *	 Value 0 :  1
 *	 Value 1 :  1
 *	 Value 2 :  1
 *	 Value 3 :  1
 *	 Value 4 :  2
 *	 Value 5 :  2
 *	 Value 6 :  2
 *	 Value 7 :  2
 *	 Value 8 :  3
 *	 Value 9 :  3
 *
 *	 The Inputed Array is :
 *	 ----------------------
 *	 1  1  1  1  2  2  2  2  3  3 
 *
 *	 The Duplicate value(s)
 *	 ----------------------
 *	 1  2  3 
 *
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task2;

import java.util.Scanner;

class Arrays
{
	int arr[], dup[], alength,i,j,k,count=0, flag=0;
	Scanner input = new Scanner(System.in);

	
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
		 dup = new int[alength/2];
		 
		 System.out.println("\n Enter the values in the array:\n------------------------------");
		 	for(i=0;i<alength;i++)
		    {
		 		System.out.print(" Value "+i+" :  ");
		 		arr[i] = input.nextInt();
		 		
		 		if(i>0)
		 		{
		 			for(j=0;j<i;j++)
		 			{
		 				if(arr[i]==arr[j])
		 				{
		 					if(count==0)
		 					{
		 						dup[0]=arr[i];
		 						count++;
		 					}
		 					else
		 					{
		 						for(k=0;k<count;k++)
		 						{
		 							flag=0;
		 							if(dup[k]==arr[i])
		 							{
		 								flag=1;
		 								break;
		 							}
		 						}
		 						
		 						if(flag==0)
		 						{
		 							dup[count]=arr[i];
		 							count++;
		 						}
		 					}
		 				}
		 			}
		 		}
		 		  
		    }
		 	
		 System.out.println("\n The Inputed Array is :\n ----------------------");
		 	for(i=0;i<alength;i++)
		 		System.out.print(" "+arr[i]+" ");
		 System.out.println("");
		 
		 System.out.println("\n The Duplicate value(s)\n ----------------------");
		 	for(i=0;i<count;i++)
		 		System.out.print(" "+dup[i]+" ");
		 System.out.println("");
	}
}

public class DupArrEle 
{
	public static void main(String[] args) 
	{
		Arrays ar = new Arrays();
		ar.arrInput();
	}

}
