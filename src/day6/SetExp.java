package day6;

import java.util.TreeSet;
import java.util.Scanner;
import java.io.IOException;
import java.util.Iterator;

class SetTest
{
	TreeSet<String> ts = new TreeSet<String>();
	Scanner input = new Scanner(System.in);
	String str; char ch; int flag=0;
	
	void display()
	{
		//--------------------- D I S P L A Y I N G   T H E   S E T -------------------------
			Iterator<String> ittr = ts.iterator();
			System.out.println("\n\n The TreeSet is :\n ---------------------------");
			while(ittr.hasNext())
			{
				System.out.println(" "+ittr.next());
			}
	}
	
	void SetTestImpl() throws IOException
	{
		//------------------ I N E S E R T I O N   I N   T H E   S E T ---------------------
				
				do 
				{
					System.out.print("\n Enter the name to be inserted in the list :  ");
					str = input.next();
					str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
					ts.add(str);
					System.out.print(" Do you want to enter more(y/n) :  ");
					ch=(char)System.in.read();
				}while(ch=='y'||ch=='Y');
				
				display();
				
		//------------------ R E M O V I N G   F R O M   T H E   S E T ----------------------
				Iterator<String> itr = ts.iterator();
				do 
				{
					System.out.print("\n Enter the name you want to delete from the list :  ");
					str = input.next();
					itr = ts.iterator();
					
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

public class SetExp
{
	public static void main(String[] args) throws IOException
	{
		SetTest st = new SetTest();
		st.SetTestImpl();
	}

}
