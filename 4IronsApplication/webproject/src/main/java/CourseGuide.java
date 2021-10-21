

import java.io.IOException;
import java.io.PrintWriter;

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
				+ "				width: fit-content;\r\n"
				+ "			}\r\n"
				+ "		</style>\r\n"
				+ "\r\n"
				+ "		<div class=\"header\">\r\n"
				+ "			<h1>The Four Irons</h1>\r\n"
				+ "			<div class=\"links\">\r\n"
				+ "				<h3>Store</h3>\r\n"
				+ "				<h3>Local Course Guide</h3>\r\n"
				+ "			</div>\r\n"
				+ "		</div>\r\n"
				+ "		<h2>Omaha Course Guide</h2>\r\n"
				+ "		<div class=\"courseGuide\">\r\n"
				+ "			<div class=\"course\">\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "			</div>\r\n"
				+ "			<div class=\"course\">\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "			</div>\r\n"
				+ "			<div class=\"course\">\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "				<h6>Waverly Golf Course</h6>\r\n"
				+ "			</div>\r\n"
				+ "		</div>\r\n"
				+ "	</body>\r\n"
				+ "</html>\r\n"
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
