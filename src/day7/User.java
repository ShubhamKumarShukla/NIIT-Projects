package day7;

import java.util.Scanner;

class MyException extends Exception
{
	public MyException(String str)
	{
		super(str);
	}
}

public class User 
{
	
	static Scanner input;
	public static void main(String[] args) 
	{
		int age;
		input = new Scanner(System.in);
		System.out.println("\n\t W E L C O M E   T O   T H E   P U B\n\t -----------------------------------");
		System.out.print("\n Enter your age :  ");
		age=input.nextInt();
		 try
	        {
	            if(age<20)
	            throw new MyException("\n Y O U   A R E   U N D E R A G E !!!!");
	        }
	        catch (MyException e)
	        {
	            System.out.println(e.getMessage());
	            System.out.println(" Fun is something you should consider while enjoying but this is not"
	            		+ " the way for you now.");
	        }
	}

}
