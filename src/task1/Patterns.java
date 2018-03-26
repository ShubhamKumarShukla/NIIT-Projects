/*
 * QUESTION 1
 * Printing patterns
 * 
 * Pattern 1
 * ---------
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * Pattern 2
 * ---------
 * 5 4 3 2 1
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 * 
 * Pattern 3
 * ---------
 *       x
 *     x x x
 *   x x x x x
 * x x x x x x x
 *   x x x x x
 *     x x x
 *       x
 *       
 * CREATED BY - SHUBHAM KUMAR SHUKLA
 * */
package task1;

class AllPatterns
{
	int i,j,l;
	void Pattern1()
	{
		System.out.println("\n The First Pattern\n -----------------");
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" "+(j+1));
			}
			System.out.println("");
		}
	}
	
	void Pattern2()
	{
		System.out.println("\n The Second Pattern\n ------------------");
		for(i=0;i<5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
	}
	
	void Pattern3()
	{
		System.out.println("\n The Third Pattern\n -----------------");
		
		  for(i=0;i<4;i++)
	      {
	          for(l=0;l<4-i;l++)
	          {
	        	  System.out.print("  ");
	          }

	          for(j=0;j<(1+(2*i));j++)
	          {
	        	  System.out.print("x ");
	          }
	          System.out.print("\n");
	      }		  
		  for(i=1;i<4;i++)
	      {
	          for(l=0;l<=i;l++)
	          {
	        	  System.out.print("  ");
	          }

	          for(j=0;j<(5-2*(i-1));j++)
	          {
	        	  System.out.print("x ");
	          }
	          System.out.print("\n");
	      }
	}
	
}

public class Patterns 
{

	public static void main(String[] args) 
	{
		AllPatterns ap = new AllPatterns();
		ap.Pattern1();
		ap.Pattern2();
		ap.Pattern3();
	}

}
