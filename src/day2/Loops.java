package day2;

public class Loops {

	public static void main(String[] args) 
	{
		int x=1;
		System.out.println("\n\t THE WHILE LOOP\n\t ==============\n Printing 7's table using while loop\n -----------------------------------");
		 while(x<=10)
		 {
			 System.out.println("\t   7 x "+x+" = "+(7*x));
			 x++;
		 }
		 
		x=1;
		System.out.println("\n\n\t THE DO-WHILE LOOP\n\t =================\n Printing 7's table using do-while loop\n --------------------------------------");
		 do
		 {
			 System.out.println("\t   7 x "+x+" = "+(7*x));
			 x++;
		 }while(x<=10);
		 
		 System.out.println("\n\t THE FOR LOOP\n\t ============\n Printing 7's table using for loop\n ---------------------------------");
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("\t   7 x "+(i+1)+" = "+(7*(i+1)));
		 }
		
	}

}
