
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
		
		String id = request.getQueryString();
		String[] ids = id.split("=");
		System.out.println("in update servlet length of ids[] : "+ids.length+" "+ids[0]+ids[1]+ids[2]+ids[3]);
		String param = ids[1];
		
		System.out.println("header : "+request.getHeader("EditServlet"));
		
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
	         
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345678");
           
    		String name = request.getParameter("Name");
    		String test = request.getParameter("Test");
    		String date = request.getParameter("Date");
    		String time = request.getParameter("Time");
    		String location = request.getParameter("Address");
    		
            PreparedStatement ps=con.prepareStatement("update customertest set Test=?, Date=?, Time=?, Location=? where Name = ?");  
            //ps.setString(1,name);  
            ps.setString(1,test);  
            ps.setString(2,date);  
            ps.setString(3,time);  
            ps.setString(4,location);
            ps.setString(5, name);
              
            int status=ps.executeUpdate();  
            if(status==1) {
            response.sendRedirect("/test/specialist_home");}
            else {
            	out.println("cannot update the values in databases.....");
            	response.sendRedirect("/test/specialist_home");
            }
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
