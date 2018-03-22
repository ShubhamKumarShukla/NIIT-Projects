package day2;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) 
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int add[][] = new int[3][3];
		int sub[][] = new int[3][3];
		int i,j;	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n Enter values in array A\n -----------------------");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" Enter the "+i+" , "+j+" value :  ");
				a[i][j] = input.nextInt();
			}
		}
		
		System.out.println("\n Enter values in array B\n -----------------------");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" Enter the "+i+" , "+j+" value :  ");
				b[i][j] = input.nextInt();
			}
		}

		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				add[i][j] = a[i][j] + b[i][j];
				sub[i][j] = a[i][j] - b[i][j];
			}
		}
		
		
		System.out.println("\n The Array A is :\n ----------------");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\n The Array B is :\n ----------------");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("\n The Addition Array is :\n -----------------------");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+add[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\n The Subtraction Array is :\n --------------------------");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+sub[i][j]);
			}
			System.out.println("");
		}
							
	}

}
