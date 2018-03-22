package day2;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) 
	{
		int arr[] = new int[10];
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\n Enter the elment at index "+i+" :  ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("\n\n The entered array is as follows : \n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
