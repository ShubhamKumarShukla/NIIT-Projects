package day3;

class Pat2
{
	void output()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((i+1)+" ");
			}
			System.out.println("");
		}
	}
}

public class Pattern2 
{
	public static void main(String[] args) 
	{
		Pat2 p = new Pat2();
		p.output();
	}

}
