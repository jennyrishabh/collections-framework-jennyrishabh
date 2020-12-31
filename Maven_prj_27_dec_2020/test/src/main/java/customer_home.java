

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class customer_home
 */

public class customer_home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customer_home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		//to print something on brower - printwriter or printStream class can be used 
		PrintWriter out=response.getWriter();
		
		
		out.println("  <html>\n"
				+ "<head>\n"
				+ "<style>\n"
				+ "body \n"
				+ "{\n"
				+ "  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url(\"back.jpg\");\n"
				+ "  margin: 0;\n"
				+ "  width: 100%;\n"
				+ "  font-family: Arial, Helvetica, sans-serif;\n"
				+ "}\n"
				+ "\n"
				+ ".navigationbar \n"
				+ "{\n"
				+ "  overflow: hidden;\n"
				+ "  background-color: 00b4ff;\n"
				+ "}\n"
				+ "\n"
				+ ".navigationbar a \n"
				+ "{\n"
				+ "  float: left;\n"
				+ "  color: #f2f2f2;\n"
				+ "  text-align: center;\n"
				+ "  padding: 14px 16px;\n"
				+ "  text-decoration: none;\n"
				+ "  font-size: 17px;\n"
				+ "}\n"
				+ "\n"
				+ ".navigationbar a:hover \n"
				+ "{\n"
				+ "  background-color: caf55f;\n"
				+ "  color: white;\n"
				+ "}\n"
				+ "</style>\n"
				+ "\n"
				+ "\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "<div class=\"navigationbar\">\n"
				+ "  <a href=\"index.jsp\">Home</a>\n"
				+ "  <a href=\"c.html\">Log Out</a>\n"
				+ "</div>\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "<style>\n"
				+ "table {\n"
				+ "  background-color:white;	\n"
				+ "  border-collapse: collapse;\n"
				+ "  width: 100%;\n"
				+ "  border: 10px solid lightblue;\n"
				+ "}\n"
				+ "\n"
				+ "th, td {\n"
				+ "  text-align: center;\n"
				+ "  padding: 46px;\n"
				+ "}\n"
				+ "</style>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "\n"
				+ "<h1 align=\"center\" style=\"color:white\" > WELCOME :Upcoming Appointments...</h1>   ");
		try {
			//step -1 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step -2 
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "12345678");
			
			//step -3 
			Statement stmt =con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from customertest order by Date asc");
			//ResultSet works just like an iterator() in collections...
			out.println("<table>\n"
					+ "  <tr>\n"
					+ "    <th>Doctor's Name</th>"
					+ "    <th>Test</th>"
					+ "    <th>Test Date[MM:DD:YYYY]</th>"
					+ "    <th>Test Time</th>"
					+ "    <th>Location</th>"
					+ "  </tr>");
			
			while(rs.next()) {
				
				out.println("<tr>"
						+ "    <td>"+rs.getString("Name") +"</td>"
						+ "    <td>"+rs.getString("Test") +"</td>"
						+ "    <td>"+rs.getString("Date") +"</td>"
						+ "    <td>"+rs.getString("Time") +"</td>"
						+ "    <td>"+rs.getString("Location") +"</td>"
						+ "  </tr>");
				
			}
			
			

			rs.close();
			stmt.close();
			con.close();
			
			}catch(SQLException e) {e.printStackTrace();}
			catch(ClassNotFoundException e ) {e.printStackTrace();}
		
		
		
		out.println("</table></body>");
		out.println("</HTML>");
		out.flush();
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
