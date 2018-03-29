package day4;

import java.util.Scanner;

class A
{
	protected String name;
	protected String DOB;
	 protected void setA(String n, String d)
	 {
		 name=n;
		 DOB=d;
	 }
}

class B extends A
{
	private String Post;
	 public void setPost(String p)
	 {
		 Post=p;
	 }
	 public void show()
	 {
		 System.out.println("\n Name           : "+name);
		 System.out.println("\n Date of Birth  : "+DOB);
		 System.out.println("\n Post           : "+Post);
	 }
	 
}

public class InheritClass 
{

	public static void main(String[] args) 
	{
		B b = new B(); String n,d,p;
		Scanner input = new Scanner(System.in);
          
		System.out.print("\n Enter Name           : ");
		n=input.nextLine();
		System.out.print("\n Enter Date of Birth  : ");
		d=input.nextLine();
		System.out.print("\n Enter Post           : ");
		p=input.nextLine();
        b.setPost(p);
        b.setA(n, d);
        b.show();
	}

}
