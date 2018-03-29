package day6;

import java.util.Scanner;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

class ListTest
{
	List<Integer> IntList = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	int num, flag=0; char ch;
	
	void display()
	{
		//--------------------- D I S P L A Y I N G   T H E   L I S T-------------------------
		
		Iterator<Integer> ittr = IntList.iterator();
		System.out.println("\n\n The Arraylist is :\n ---------------------------");
		while(ittr.hasNext())
		{
			System.out.print(" "+ittr.next()+" ");
		}
	}
	
	void ListTestImpl() throws IOException
	{
		//------------------ I N E S E R T I O N   I N   T H E   L I S T ---------------------
		
		do 
		{
			System.out.print("\n Enter a number to be inserted in the list :  ");
			num = input.nextInt();
			IntList.add(num);
			System.out.print(" Do you want to enter more(y/n) :  ");
			ch=(char)System.in.read();
		}while(ch=='y'||ch=='Y');
		display();
				
		//------------------ R E M O V I N G   F R O M   T H E   L I S T ----------------------
		Iterator<Integer> itr = IntList.iterator();
		do 
		{
			System.out.print("\n Enter the number you want to delete from the list :  ");
			num = input.nextInt();
			itr = IntList.iterator();
			while(itr.hasNext())
			{
				if(itr.next()==num)
				{
					System.out.println("\n "+num+" deleted from the list.");
					itr.remove();
					flag=1;
					display();
				} 
			}
			
			if(flag==0)
				System.out.println("\n S O R R Y !!! Nothing to delete.");
			
			System.out.print("\n Do you want to enter more(y/n) :  ");
			ch=(char)System.in.read();
		}while(ch=='y'||ch=='Y');
		
	}
}

public class Listing 
{
	public static void main(String[] args) throws IOException
	{
		ListTest lt = new ListTest();
		lt.ListTestImpl();
	}

}
