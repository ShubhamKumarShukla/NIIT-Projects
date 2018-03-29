package day7;

import java.util.Scanner;

class DivideByZero
{
	int a, b, result;
	Scanner input = new Scanner(System.in);
	
	void check()
	{
		System.out.print("\n Enter the first number  :  ");
		a=input.nextInt();
		System.out.print("\n Enter the second number :  ");
		b=input.nextInt();
		
		try
		{
			result = a/b;
			System.out.print("\n The result is           :  ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n DIVIDED BY ZERO!!!! SERIOUSLY! \n The result will always be Undefined.");
		}
	}
	
}

public class ByZero 
{
	public static void main(String[] args) 
	{
		DivideByZero d = new DivideByZero();
		d.check();
	}

}
