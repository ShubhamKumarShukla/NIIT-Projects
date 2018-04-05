/*
 *  QUESTION 19
 *  A java program to implement abstraction using interface.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task2;

import java.util.Scanner;

interface Calculator
{
  public void add(int x,int y);
  public void sub(int x,int y);
  public void multi(int x,int y);
  public void divide(int x,int y);
}



class Calci implements Calculator
{
	
	public void add(int x,int y)
	{
		System.out.println("\n The Sum of "+x+" and "+y+" is        :  "+(x+y));
	}
	public void sub(int x,int y)
	{
		System.out.println("\n The Difference of "+x+" and "+y+" is :  "+(x-y));
	}
	public void multi(int x,int y)
	{
		System.out.println("\n The Product of "+x+" and "+y+" is    :  "+(x*y));
	}
	public void divide(int x,int y)
	{
		if(y!=0)
	       System.out.println("\n The Divison of "+x+" and "+y+" is    :  "+((double)x/(double)y));
	    else
	       System.out.println("\n Can't Divide by 0.");
	}
	
}

public class CalciCal
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
	    int x,y;
	    Calci c = new Calci();
	       System.out.print("\n Enter x :  ");
	       x=input.nextInt();
	       System.out.print("\n Enter y :  ");
	       y=input.nextInt();
	  	c.add(x,y);
	  	c.sub(x,y);
	  	c.multi(x,y);
	  	c.divide(x,y);
	}

}
