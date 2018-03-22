package day3;

class Even
{
	void output()
	{
		System.out.println("\nThe list of even numbers from 1 to 50 is as follows: \n");
		for(int i=1;i<=50;i++)
		{
			if(i % 2 == 0)
				System.out.print(i+"\t");
		}
	}
}

public class Even50 {

	public static void main(String[] args)
	{
		Even e = new Even();
		e.output();
	}

}
