/*
 *  QUESTION 11
 *  A java program to display a reverse String array.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.util.Scanner;

class ReverseStr
{
	String str; char s[],temp; int i,j;
	Scanner input = new Scanner(System.in);
	
	void Rev()
	{
		System.out.print("\n Enter the string :  ");
		str = input.nextLine();
		s=str.toCharArray();
		
		for(i=0,j=s.length-1;i<(s.length/2);i++,j--)
		{
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		
		System.out.println("\n The reverse string is : "+String.valueOf(s));
	}
}

public class Reverse 
{
	public static void main(String[] args) 
	{
		ReverseStr r = new ReverseStr();
		r.Rev();
	}

}
