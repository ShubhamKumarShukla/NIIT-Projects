package day3;

class Pat1
{
	void output()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println("");
		}
	}
}

public class Pattern1 
{
	public static void main(String[] args) 
	{
		Pat1 p = new Pat1();
		p.output();
	}

}
