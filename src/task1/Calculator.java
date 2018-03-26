/*
 * 	QUESTION 8
 *  A java program  using switch case to create calculator with + - / * functionalities only.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.io.IOException;
import java.util.Scanner;

class Calci
{
	char ch;
	int choice; long result, num1, num2; double result2;
	Scanner input = new Scanner(System.in); 
	
	void Calc() throws IOException
	{
		do
		{
			System.out.println("\n\t\t M E N U\n\t\t =======");
			System.out.print("\n\t 1. Addition of 2 numbers\n\t 2. Subtraction of 2 numbers"
					+ "\n\t 3. Multiplication of 2 numbers\n\t 4. Division of 2 numbers"
					+"\n Enter your choice :  ");
			choice = input.nextInt();
			
			switch(choice)
			{
				case 1 : System.out.print("\n Enter first number  :  ");
						 num1=input.nextInt();
						 System.out.print("\n Enter second number :  ");
						 num2=input.nextInt();
						 result = num1 + num2;
						 System.out.println("\n The result of the addition is :  "+result);
						 break;
				case 2 : System.out.print("\n Enter first number  :  ");
				 		 num1=input.nextInt();
				 		 System.out.print("\n Enter second number :  ");
				 		 num2=input.nextInt();
				 		 result = num1 - num2;
				 		 System.out.println("\n The result of the subtraction is :  "+result);
				 		 break;
				case 3 : System.out.print("\n Enter first number  :  ");
				 		 num1=input.nextInt();
				 		 System.out.print("\n Enter second number :  ");
				 		 num2=input.nextInt();
				 		 result = num1 * num2;
				 		 System.out.println("\n The result of the multiplication is :  "+result);
				 		 break;
				case 4 : System.out.print("\n Enter first number  :  ");
				 		 num1=input.nextInt();
				 		 System.out.print("\n Enter second number :  ");
				 		 num2=input.nextInt();
				 		 result2 = (double)num1 / (double)num2;
				 		 System.out.println("\n The result of the division is :  "+result2);
				 		 break;
				default: System.out.println("\n W R O N G   C H O I C E !!!!\n Please, enter your choice among the given one.");
			}
			System.out.print("\n Do you want to enter more(Y/N) :   ");
			ch=(char)System.in.read();
		}while(ch=='y'||ch=='Y');
	}
	
}

public class Calculator 
{
	public static void main(String[] args) throws IOException 
	{
		Calci c = new Calci();
		c.Calc();
	}

}
