package day3;

import java.util.Scanner;

class Rev
{
	long num,n,digit,rev=0;
	Scanner input = new Scanner(System.in);
	
	void reverse()
	{
		System.out.print("\n Enter the number to be reversed :  ");
		num = input.nextInt();
		n=num;
		do
        {
           digit=num%10;
           rev=(rev*10)+digit;
           num =num/10;
        }  while(num!=0);
		System.out.print("\n The reverse of the number "+n+" :  "+rev);
	}
	
}

public class Reverse {

	public static void main(String[] args) 
	{
		Rev r = new Rev();
		r.reverse();
	}

}
