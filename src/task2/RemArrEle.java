/*
 *  QUESTION 22
 *  A java program to remove a specific element from an array.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task2;

import java.util.Scanner;

class RemAnEle
{
	int arr[], alength, temp, i, j, del, flag=0; char ch;
	Scanner input = new Scanner(System.in);
	
	void shift(int a, int l)
	{
		for(int x=a;x<l-1;x++)
		{
			arr[x]=arr[x+1];
		}
	}
	
	void remEle()
	{
		do
		{
			System.out.print("\n Enter the element you want to delete :  ");
			del=input.nextInt();
			flag=0;
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]==del)
				{
					if(i!=(alength-1))
					{
						arr[i]=arr[i+1];					
						shift(i+1,alength);
					}
					else
					{
						arr[i]=0;
						alength--;
						flag=1;
					}
					
				}
			}
			
			if(alength==0)
			{
				System.out.print("\n Array is empty now!!!!");
				break;
			}
			
			if(flag==0)
				System.out.println("\n No element to delete!!!!");
			else
			{
				System.out.println("\n The New Array is :\n ----------------------");
			 	for(i=0;i<alength;i++)
			 		System.out.print(" "+arr[i]+" ");
			 	
			}
			
		 	System.out.print("\n\n Do you want to enter more(y/n):  ");
			ch=input.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
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
		 remEle();
	}
}

public class RemArrEle 
{
	public static void main(String[] args) 
	{
		RemAnEle r = new RemAnEle();
		r.arrInput();
	}
}
