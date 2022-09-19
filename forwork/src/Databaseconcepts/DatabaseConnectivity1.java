package Databaseconcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnectivity1 
{

	@Test
	public void script() throws SQLException
	{
		String host="localhost";
		String port="3306";
	    Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/credentials", "root", "Root" );
		Statement s = con.createStatement();
		ResultSet res = s.executeQuery("Select * from tequilla where username='admin';");
		res.next();
		System.out.println(res.getString("username"));
		System.out.println(res.getString("password"));
		
	}
}
