

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class customer_login
 */
public class customer_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customer_login() {
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
		//doGet(request, response);
		
		
		

		String pass=request.getParameter("psw");
		String email=request.getParameter("email");

		
		//System.out.println("anme enter by user : "+name);
		System.out.println("also password entered by user is :"+pass);
		System.out.println("email entered is  :"+email);

		
		//2.
		response.setContentType("text/html");
		//to print something on brower - printwriter or printStream class can be used 
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>Hello from myforms...</title></head><body><br>ERROR MESSAGE FROM : SERVER");
		
		
		try {
			//step -1 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step -2 
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "12345678");
			
			//step -3 
			Statement stmt =con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from customer order by ID asc");
			//ResultSet works just like an iterator() in collections...
			int count=0;String target="";
			while(rs.next()) {
				
				String n=rs.getString("ID");
				String p=rs.getString("Pass");
				//String e=rs.getString("Email");
				
				if(n.equals(email)) {
					if(p.equals(pass)) {
						count=1;

					}
				}
				
			}
			
			
			
			if(count==1) {response.sendRedirect("/test/customer_home");}
			
			
			if(count==0) {out.println("<br>INVALID USER.....plz re-enter your details..<br><br>click this button to redirect :");out.println("<button><a href=\"login(customer).html\">SIGN UP</button> ");}

			rs.close();
			stmt.close();
			con.close();
			
			}catch(SQLException e) {e.printStackTrace();}
			catch(ClassNotFoundException e ) {e.printStackTrace();}
		
		
		
		out.println("</body>");
		out.println("</HTML>");
		out.flush();
		
		
	}

}
