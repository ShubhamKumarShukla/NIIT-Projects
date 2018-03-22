package day2;

public class Uranary {

	public static void main(String[] args) 
	{
		int a = 3, b;
		System.out.print("\n THE INCREMENT OPERATORS \n -----------------------");
		System.out.println("\n The value of a is :  "+a);
		b = a++ + ++a;
		System.out.println("\n The value of b is :  a++ + ++a =  "+b);
		
		System.out.print("\n\n THE DECREMENT OPERATORS \n -----------------------");
		System.out.println("\n The value of a is :  "+a);
		b = a-- - --a;
		System.out.println("\n The value of b is :  a-- - --a =  "+b);
		
	}

}
