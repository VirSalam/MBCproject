package M1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

public class Doc 
{
	public ArrayList init()
	{
		Statement stmt=null;
		PreparedStatement pstmt=null;
		Connection con=null;
		ResultSet res=null;		
		
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());		
			System.out.println("Driver Sucess");
		}
		catch(Exception e)
		{
			System.out.println("Driver Failed");
		}
		try
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
			System.out.println("Conection is established succesfully");
		}
		catch (Exception e)
		{
			System.out.println("Conection failed");
		}
		
		ArrayList al=new ArrayList();
		
		try
		{			
			    stmt=con.createStatement();
			    res=stmt.executeQuery("SELECT * FROM COLLEGE1");			    				
				while(res.next()==true)
				{
					String a=res.getString(1);
					String b=res.getString(2);
					String c=res.getString(3);
					StudentDatabase sd=new StudentDatabase(a,b,c);		
					
					al.add(sd.ID);
					al.add(sd.name);
					al.add(sd.sex);
				}
				
			}
			catch (Exception e)
			{
				
		    }
			return al;			
	}
}
	
		
			
	



