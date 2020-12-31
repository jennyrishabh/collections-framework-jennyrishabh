

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
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
//        String id = request.getQueryString();
//		String[] ids = id.split("=");
//		System.out.println(ids[1]);
//		String selected_name = ids[1];
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//	         
//    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345678");
//    		
////    		Statement stmt = con.createStatement();
//    		
//    		String query = "select * from customertest where Name = ?";
//    		
//    		PreparedStatement pst = con.prepareStatement(query);
//    		pst.setString(1, selected_name);
//    		
//    		ResultSet rs = pst.executeQuery();
//    		
//    		out.println("<html>\n"
//    				+ "<head>\n"
//    				+ "<style>\n"
//    				+ "body \n"
//    				+ "{\n"
//    				+ "  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url(\"back.jpg\");\n"
//    				+ "  margin: 0;\n"
//    				+ "  width: 100%;\n"
//    				+ "  font-family: Arial, Helvetica, sans-serif;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".navigationbar \n"
//    				+ "{\n"
//    				+ "  overflow: hidden;\n"
//    				+ "  background-color: 00b4ff;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".navigationbar a \n"
//    				+ "{\n"
//    				+ "  float: left;\n"
//    				+ "  color: #f2f2f2;\n"
//    				+ "  text-align: center;\n"
//    				+ "  padding: 14px 16px;\n"
//    				+ "  text-decoration: none;\n"
//    				+ "  font-size: 17px;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".navigationbar a:hover \n"
//    				+ "{\n"
//    				+ "  background-color: caf55f;\n"
//    				+ "  color: white;\n"
//    				+ "}\n"
//    				+ "</style>\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "</head>\n"
//    				+ "<body>\n"
//    				+ "<div class=\"navigationbar\">\n"
//    				+ "  <a class=\"active\" href=\"#home\">Home</a>\n"
//    				+ "  <a href=\"#news\">Log Out</a>\n"
//    				+ "</div>\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "<style>\n"
//    				+ "table {\n"
//    				+ "  background-color:white;	\n"
//    				+ "  border-collapse: collapse;\n"
//    				+ "  width: 100%;\n"
//    				+ "  border: 10px solid lightblue;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ "th, td {\n"
//    				+ "  text-align: center;\n"
//    				+ "  padding: 16px;\n"
//    				+ "}\n"
//    				+ "</style>\n"
//    				+ "</head>\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "<style>\n"
//    				+ "* {\n"
//    				+ "  box-sizing: border-box;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".columns {\n"
//    				+ "  float: left;\n"
//    				+ "  width: 23.3%;\n"
//    				+ "  padding: 40px;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".price {\n"
//    				+ "  list-style-type: none;\n"
//    				+ "  background-color:white;\n"
//    				+ "  border: 1px solid #eee;\n"
//    				+ "  margin: 0;\n"
//    				+ "  padding: 0;\n"
//    				+ "  -webkit-transition: 0.3s;\n"
//    				+ "  transition: 0.3s;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".price:hover {\n"
//    				+ "  box-shadow: 0 50px 42px 0 rgba(0,0,0,0.1)\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".price .header {\n"
//    				+ "  background-color: lightblue;\n"
//    				+ "  color: white;\n"
//    				+ "  font-size: 25px;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".price li {\n"
//    				+ "  border-bottom: 1px solid white;\n"
//    				+ "  padding: 20px;\n"
//    				+ "  text-align: center;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ ".price .grey {\n"
//    				+ "  background-color: white;\n"
//    				+ "  font-size: 20px;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "}\n"
//    				+ "</style>\n"
//    				+ "</head>\n"
//    				+ "<body>\n"
//    				+ "\n"
//    				+ "<h1 align=\"center\" style=\"color:white\">TESTS</h1>\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "\n"
//    				+ "<style>\n"
//    				+ "body {\n"
//    				+ "  font-family: Arial;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ "input[type=text], select {\n"
//    				+ "  width: 100%;\n"
//    				+ "  padding: 12px 20px;\n"
//    				+ "  margin: 8px 0;\n"
//    				+ "  display: block;\n"
//    				+ "  border: 1px solid #ccc;\n"
//    				+ "  border-radius: 4px;\n"
//    				+ "  box-sizing: border-box;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ "input[type=submit] {\n"
//    				+ "  width: 100%;\n"
//    				+ "  background-color: #4CAF50;\n"
//    				+ "  color: white;\n"
//    				+ "  padding: 14px 20px;\n"
//    				+ "  margin: 8px 0;\n"
//    				+ "  border: none;\n"
//    				+ "  border-radius: 4px;\n"
//    				+ "  cursor: pointer;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ "input[type=submit]:hover {\n"
//    				+ "  background-color: #45a049;\n"
//    				+ "}\n"
//    				+ "\n"
//    				+ "div.container {\n"
//    				+ "  border-radius: 5px;\n"
//    				+ "  background-color: #f2f2f2;\n"
//    				+ "  padding: 40px;\n"
//    				+ "}\n"
//    				+ "</style>\n"
//    				+ "<body>\n"
//    				+ "\n"
//    				+ "");
//    		
//    		while(rs.next()) {
//    			out.println(" <form action=\"/action_page.php\">\n"
//    					+ "    \n"
//    					+ "    <input type=\"text\"  name=\"Name\" placeholder=\"Name\">\n"
//    					+ "	<input type=\"text\"  name=\"Test\" placeholder=\"Test\">\n"
//    					+ "    <input type=\"text\"  name=\"Address\" placeholder=\"Address\">\n"
//    					+ "	<input type=\"date\"  name=\"Date\" placeholder=\"Date\" >\n"
//    					+ "    <input type=\"time\"  name=\"Time\" placeholder=\"Time from'9am'to'6pm'\" >\n"
//    					+ "  \n"
//    					+ "    <input type=\"submit\" value=\"Submit\">\n"
//    					+ "  </form>");  
//    		}
//    		
//    		
//		}catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//        
//        out.println("</body>\n"
//        		+ "</html>\n"
//        		+ "</body>\n"
//        		+ "</html>\n"
//        		+ "");
        
        out.println("<html>\n"
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
        		+ "  <a class=\"active\" href=\"#home\">Home</a>\n"
        		+ "  <a href=\"#news\">Log Out</a>\n"
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
        		+ "  padding: 16px;\n"
        		+ "}\n"
        		+ "</style>\n"
        		+ "</head>\n"
        		+ "\n"
        		+ "\n"
        		+ "\n"
        		+ "<style>\n"
        		+ "* {\n"
        		+ "  box-sizing: border-box;\n"
        		+ "}\n"
        		+ "\n"
        		+ ".columns {\n"
        		+ "  float: left;\n"
        		+ "  width: 23.3%;\n"
        		+ "  padding: 40px;\n"
        		+ "}\n"
        		+ "\n"
        		+ ".price {\n"
        		+ "  list-style-type: none;\n"
        		+ "  background-color:white;\n"
        		+ "  border: 1px solid #eee;\n"
        		+ "  margin: 0;\n"
        		+ "  padding: 0;\n"
        		+ "  -webkit-transition: 0.3s;\n"
        		+ "  transition: 0.3s;\n"
        		+ "}\n"
        		+ "\n"
        		+ ".price:hover {\n"
        		+ "  box-shadow: 0 50px 42px 0 rgba(0,0,0,0.1)\n"
        		+ "}\n"
        		+ "\n"
        		+ ".price .header {\n"
        		+ "  background-color: lightblue;\n"
        		+ "  color: white;\n"
        		+ "  font-size: 25px;\n"
        		+ "}\n"
        		+ "\n"
        		+ ".price li {\n"
        		+ "  border-bottom: 1px solid white;\n"
        		+ "  padding: 20px;\n"
        		+ "  text-align: center;\n"
        		+ "}\n"
        		+ "\n"
        		+ ".price .grey {\n"
        		+ "  background-color: white;\n"
        		+ "  font-size: 20px;\n"
        		+ "}\n"
        		+ "\n"
        		+ "\n"
        		+ "}\n"
        		+ "</style>\n"
        		+ "</head>\n"
        		+ "<body>\n"
        		+ "\n"
        		+ "<h1 align=\"center\" style=\"color:white\">TESTS</h1>\n"
        		+ "\n"
        		+ "\n"
        		+ "\n"
        		+ "<style>\n"
        		+ "body {\n"
        		+ "  font-family: Arial;\n"
        		+ "}\n"
        		+ "\n"
        		+ "input[type=text], select {\n"
        		+ "  width: 100%;\n"
        		+ "  padding: 12px 20px;\n"
        		+ "  margin: 8px 0;\n"
        		+ "  display: block;\n"
        		+ "  border: 1px solid #ccc;\n"
        		+ "  border-radius: 4px;\n"
        		+ "  box-sizing: border-box;\n"
        		+ "}\n"
        		+ "\n"
        		+ "input[type=submit] {\n"
        		+ "  width: 100%;\n"
        		+ "  background-color: #4CAF50;\n"
        		+ "  color: white;\n"
        		+ "  padding: 14px 20px;\n"
        		+ "  margin: 8px 0;\n"
        		+ "  border: none;\n"
        		+ "  border-radius: 4px;\n"
        		+ "  cursor: pointer;\n"
        		+ "}\n"
        		+ "\n"
        		+ "input[type=submit]:hover {\n"
        		+ "  background-color: #45a049;\n"
        		+ "}\n"
        		+ "\n"
        		+ "div.container {\n"
        		+ "  border-radius: 5px;\n"
        		+ "  background-color: #f2f2f2;\n"
        		+ "  padding: 40px;\n"
        		+ "}\n"
        		+ "</style>\n"
        		+ "<body>\n"
        		+ "\n"
        		+ "\n"
        		+ "<div class=\"container\">\n"
        		+ "  <form method=\"get\" action=\"/test/UpdateServlet\">\n"
        		+ "    \n"
        		+ "    <input type=\"text\"  name=\"Name\" placeholder=\"Name\">\n"
        		+ "	<input type=\"text\"  name=\"Test\" placeholder=\"Test\">\n"
        		+ "    <input type=\"text\"  name=\"Address\" placeholder=\"Address\">\n"
        		+ "	<input type=\"date\"  name=\"Date\" placeholder=\"Date\" >\n"
        		+ "    <input type=\"time\"  name=\"Time\" placeholder=\"Time from'9am'to'6pm'\" >\n"
        		+ "  \n"
        		+ "    <input type=\"submit\" value=\"Submit\">\n"
        		+ "  </form>\n"
        		+ "</div>\n"
        		+ "\n"
        		+ "\n"
        		+ "</body>\n"
        		+ "</html>\n"
        		+ "</body>\n"
        		+ "</html>\n"
        		+ "");
        
        
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
