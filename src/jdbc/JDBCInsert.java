/*
 *  Insert command using PreparedStatement interface
 * 
 */

package jdbc;

import java.sql.*;
import java.util.Scanner;

class InsertStmnt
{
	String url = "jdbc:h2:tcp://localhost/~/mt";
	String username="sa";
	String password="";
	Scanner input = new Scanner(System.in);
	int n; String name,sname;
	
	void insertInto()
	{
		System.out.print(" Insert the id             :  ");
		n=input.nextInt();
		input.nextLine(); // to avoid the return character to be passed in str
		System.out.print(" Insert the name           :  ");
		name=input.nextLine();
		System.out.print(" Insert the superhero name :  ");
		sname=input.nextLine();
		try
		{
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement stmt = con.prepareStatement("INSERT INTO SUPERHEROES VALUES(?,?,?)");
			stmt.setInt(1, n);
			stmt.setString(2, name);
			stmt.setString(3, sname);
			int i = stmt.executeUpdate();
			System.out.println(i+" record inserted!!!");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

public class JDBCInsert 
{
	public static void main(String[] args) 
	{
		InsertStmnt is = new InsertStmnt();
		is.insertInto();
	}

}
