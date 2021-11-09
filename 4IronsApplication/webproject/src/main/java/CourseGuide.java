

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseGuide
 */
@WebServlet("/CourseGuide")
public class CourseGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://ec2-3-12-154-67.us-east-2.compute.amazonaws.com:3306/clubsDB" + "?useSSL=false";
	static String user = "clubs";
	static String password = "clubs";
	static Connection connection = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseGuide() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		connection = null;
		ResultSet rs = null;
	      try {
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	         connection = DriverManager.getConnection(url, user, password);
	         
	      } catch (SQLException e) {
	         System.out.println("Connection Failed! Check output console");
	         e.printStackTrace();
	         return;
	      } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String selectSQL = "SELECT * FROM CourseTable";
	    
	      
	      try {
				PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
				 rs = preparedStatement.executeQuery();
				 PrintWriter out = response.getWriter();
				 
				 out.println("<!DOCTYPE html>\r\n"
				 		+ "<html lang=\"en\">\r\n"
				 		+ "	<head>\r\n"
				 		+ "		<meta charset=\"UTF-8\" />\r\n"
				 		+ "		<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n"
				 		+ "		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n"
				 		+ "		<title>The 4 Irons</title>\r\n"
				 		+ "	</head>\r\n"
				 		+ "	<body>\r\n"
				 		+ "		<style type=\"text/css\">\r\n"
				 		+ "			* {\r\n"
				 		+ "				margin: 0;\r\n"
				 		+ "			}\r\n"
				 		+ "			html {\r\n"
				 		+ "				background-color: #5cdb95;\r\n"
				 		+ "			}\r\n"
				 		+ "			.header {\r\n"
				 		+ "				display: flex;\r\n"
				 		+ "				justify-content: space-between;\r\n"
				 		+ "				margin-bottom: 50px;\r\n"
				 		+ "				background-color: #379683;\r\n"
				 		+ "				padding-top: 25px;\r\n"
				 		+ "				padding-bottom: 25px;\r\n"
				 		+ "			}\r\n"
				 		+ "			.links {\r\n"
				 		+ "				display: flex;\r\n"
				 		+ "				width: 300px;\r\n"
				 		+ "				justify-content: space-evenly;\r\n"
				 		+ "				align-items: center;\r\n"
				 		+ "			}\r\n"
				 		+ "\r\n"
				 		+ "			h4,\r\n"
				 		+ "			p {\r\n"
				 		+ "				margin: 0;\r\n"
				 		+ "			}\r\n"
				 		+ "			.item,\r\n"
				 		+ "			img,\r\n"
				 		+ "			h4,\r\n"
				 		+ "			p {\r\n"
				 		+ "				background-color: #edf5e1;\r\n"
				 		+ "			}\r\n"
				 		+ "\r\n"
				 		+ "			h1 {\r\n"
				 		+ "				margin-left: 15px;\r\n"
				 		+ "			}\r\n"
				 		+ "			h2 {\r\n"
				 		+ "				margin: 10px;\r\n"
				 		+ "				text-align: center;\r\n"
				 		+ "			}\r\n"
				 		+ "\r\n"
				 		+ "			.courseGuide {\r\n"
				 		+ "				display: flex;\r\n"
				 		+ "				justify-content: center;\r\n"
				 		+ "				flex-direction: column;\r\n"
				 		+ "				width: 100%;\r\n"
				 		+ "				align-items: center;\r\n"
				 		+ "			}\r\n"
				 		+ "\r\n"
				 		+ "			.course {\r\n"
				 		+ "				height: 50px;\r\n"
				 		+ "				width: 75%;\r\n"
				 		+ "				background-color: aliceblue;\r\n"
				 		+ "				margin-bottom: 25px;\r\n"
				 		+ "				display: flex;\r\n"
				 		+ "				justify-content: space-evenly;\r\n"
				 		+ "				align-items: center;\r\n"
				 		+ "				border-radius: 15px;\r\n"
				 		+ "			}\r\n"
				 		+ "\r\n"
				 		+ "			h6 {\r\n"
				 		+ "				width: -webkit-fill-available;\r\n"
				 		+ "			}\r\n"
				 		+ "		</style>\r\n"
				 		+ "\r\n"
				 		+ "		<div class=\"header\">\r\n"
				 		+ "			<h1>The Four Irons</h1>\r\n"
				 		+ "			<div class=\"links\">\r\n"
				 		+ "				<h3><a href=/webproject/Index>Store</a></h3>\r\n"
						+ "				<h3><a href=/webproject/CourseGuide>Local Course Guide</a></h3>\r\n"
				 		+ "			</div>\r\n"
				 		+ "		</div>\r\n"
				 		+ "		<h2>Omaha Course Guide</h2>\r\n"
				 		+ "		<div class=\"courseGuide\">"
				 		+ "<div class=\"course\">\r\n"
				 		+ "				<h6><em>NAME</em></h6>\r\n"
				 		+ "				<h6><em>DIFFICULTY</em></h6>\r\n"
				 		+ "				<h6><em>PUBLIC?</em></h6>\r\n"
				 		+ "				<h6><em>PHONE</em></h6>\r\n"
				 		+ "				<h6><em>ADDRESS</em></h6>\r\n"
				 		+ "			</div>");
				 while (rs.next()) {
			            
			            String name = rs.getString("Golf_Course");
			            String difficulty = rs.getString("Difficulty");
			            String Public = rs.getString("Public");
			            String phone = rs.getString("Phone");
			            String Address = rs.getString("Address");
			            
			            out.println("<div class=\"course\">\r\n"
			            		+ "				<h6> " + name + "</h6>\r\n"
			            		+ "				<h6>" + difficulty + "</h6>\r\n"
			            		+ "				<h6>" + Public + "</h6>\r\n"
			            		+ "				<h6>" + phone + "</h6>\r\n"
			            		+ "				<h6>" + Address + "</h6>\r\n"
			            		+ "			</div>");
				 }
				 
				 out.println("</div>\r\n"
				 		+ "	</body>\r\n"
				 		+ "</html>");
				 
				 
				 
				 
	      } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
