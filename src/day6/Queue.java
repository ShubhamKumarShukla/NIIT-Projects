package day6;

import java.util.Scanner;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;

class PQTest
{
	PriorityQueue<String> pQueue = new PriorityQueue<String>();
	Scanner input = new Scanner(System.in);
	String str; char ch; int flag=0;
	
	void display()
	{
		//-------------------- D I S P L A Y I N G   T H E   Q U E U E ----------------------
		System.out.println("\n The Priority Queue is :\n ---------------------------");
		Iterator<String> ittr = pQueue.iterator();
		while(ittr.hasNext())
		{
			System.out.println(" "+ittr.next());
		}
	}
	
	void PQTestImpl() throws IOException
	{
		
		//---------------- I N E S E R T I O N   I N   T H E   Q U E U E ---------------------
		
			do 
			{
				System.out.print("\n Enter the name to be inserted in the Queue :  ");
				str = input.next();
				str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
				pQueue.add(str);
				System.out.print(" Do you want to enter more(y/n) :  ");
				ch=(char)System.in.read();
			}while(ch=='y'||ch=='Y');
			
			display();
		
		//------------------ R E M O V I N G   F R O M   T H E   L I S T ----------------------
			Iterator<String> itr = pQueue.iterator();
			do 
			{
				System.out.print("\n Enter the name you want to delete from the list :  ");
				str = input.next();
				itr = pQueue.iterator();
				
				while(itr.hasNext())
				{
					if(str.equalsIgnoreCase(itr.next()))
					{
						System.out.println(" "+str+" deleted from the Set.");
						itr.remove();
						flag=1;
						display();
					}
				}
				
				if(flag==0)
					System.out.println("\n S O R R Y !!! Nothing to delete.");
				
				System.out.print(" Do you want to enter more(y/n) :  ");
				ch=(char)System.in.read();
			}while(ch=='y'||ch=='Y');
			
	}
}

public class Queue 
{
	public static void main(String[] args) throws IOException
	{
		PQTest pq = new PQTest();
		pq.PQTestImpl();
	}

}
