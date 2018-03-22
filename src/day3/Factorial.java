package day3;

import java.util.Scanner;

class Fact
{
	int num;
	long fac=1;	
	Scanner input = new Scanner(System.in);
	
	void input()
	{
		System.out.print("\n Enter the number whose factorial is to be calculated :  ");
		num=input.nextInt();
	}	
	void output()
	{
		for(int i=1;i<=num;i++)
		{
			fac = fac * i;
		}
		System.out.println("\n The factorial of "+num+ " is :  "+fac);
	}
}

public class Factorial {

	public static void main(String[] args)
	{
		Fact f = new Fact();
		f.input();
		f.output();
	}

}
