package fileRWTrial;

import java.io.*;

public class FileCopyTest 
{
	public static void main(String[] args) 
	{
		try
		{  
			FileReader fr = new FileReader("G:\\Programs\\EclipseO-Workspace\\NIIT Java\\src\\fileRWTrial\\Original.txt");
			FileWriter fw = new FileWriter("G:\\Programs\\EclipseO-Workspace\\NIIT Java\\src\\fileRWTrial\\Copy.txt");
		     
			int k;
		      while( ( k = fr.read() ) != -1 )
		      {
		        fw.write(k);   		
		        System.out.print((char) k);  
		      }
		    fw.close();
		    fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
