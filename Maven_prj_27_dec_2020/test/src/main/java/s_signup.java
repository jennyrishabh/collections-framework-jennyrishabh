

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s_signup
 */
public class s_signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s_signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=request.getParameter("email");
		String pass=request.getParameter("psw");
		//String email=request.getParameter("Email");
		
		System.out.println("email enter by user : "+email);
		System.out.println("also password entered by user is :"+pass);
		
		//2.
		response.setContentType("text/html");
		//to print something on brower - printwriter or printStream class can be used 
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>Hello from myforms...</title></head><body><br>this is for specialist login details..");
		
		
		try {
			//step -1 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step -2 
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "12345678");
			
			//step -3 
			Statement stmt =con.createStatement();
			
			int r=stmt.executeUpdate("insert into specialist values("+"'"+email+"'"+","+"'"+pass+"'"+")");
			if(r==1) {out.println("successfully inserted login details in mysql..");
			
			response.sendRedirect("/test/specialist_home");
			
			}
			else {out.println("Failed...");}
			
			System.out.println("it is working......");

			
			stmt.close();
			con.close();
			
			}catch(SQLException e) {e.printStackTrace();}
			catch(ClassNotFoundException e ) {e.printStackTrace();}
		
		
		
		out.println("<h2>Hello :"+email+" </h2></body>");
		out.println("</HTML>");
		out.flush();
		
		
		
		
	}

}
