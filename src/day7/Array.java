package day7;

import java.util.Scanner;

public class Array 
{
	static Scanner input;
	public static void main(String[] args) 
	{
		int a[]=new int[3];
		input= new Scanner(System.in);
		System.out.println("\n Enter values in array:");
		try
		{			
			for(int i=0;i<3;i++)
				a[i]=input.nextInt();
	        System.out.print(" a[4] is ");
	        System.out.println(a[4]);
		}
	    catch(ArrayIndexOutOfBoundsException e)
		{
	    	System.out.println("\n\n Sorry to say but you crossed the line of the Array and went to the restricted terriotry."
	    			+ "\n Hence  we have no other option but extermination to safeguard others.");
		}
	}

}
