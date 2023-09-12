package M1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentDetails extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException 
	{
		Doc d=new Doc();
		ArrayList al=new ArrayList();
		al.add(d.init());		
		request.setAttribute("al",al);
		
		
		RequestDispatcher rd= request.getRequestDispatcher("StudentDetails.jsp");
		rd.forward(request, response);
				
	}
}
   

	
