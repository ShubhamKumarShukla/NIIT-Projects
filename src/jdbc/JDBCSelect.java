/*
 *  select command
 * 
 */
package jdbc;

import java.sql.*;

public class JDBCSelect 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:h2:tcp://localhost/~/mt";
		String username="sa";
		String password="";
		String query="select * from SUPERHEROES";
		try
		{
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("ID\tNAME\t\tSUPERHERO NAME\n--\t----\t\t--------------\n");
				while(rs.next())
				{
					String col1= rs.getString(1);
					String col2=rs.getString(2);
					String col3=rs.getString(3);
					System.out.println(col1+ "\t"+ col2+ "\t"+ col3);
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
