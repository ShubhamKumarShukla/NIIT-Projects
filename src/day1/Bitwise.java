package day1;

public class Bitwise {

	public static void main(String[] args) 
	{
		int a = 70;	//0100 0110
		int b = 30; //0001 1110
		int c = 0;
		
		System.out.println("\n\t The Bitwise Operations\n\t ----------------------");
		c = a & b;
		System.out.println("\n a & b  =  "+c);
		c = a | b;
		System.out.println("\n a | b  =  "+c);
		c = a ^ b;
		System.out.println("\n a ^ b  =  "+c);
		c = ~a;
		System.out.println("\n ~a     =  "+c);
		c = a << 2 ;
		System.out.println("\n a << 2 =  "+c);
		c = a >> 2;
		System.out.println("\n a >> 2 =  "+c);
		c = a >>>2;
		System.out.println("\n a >>>2 =  "+c);
	}						

}
