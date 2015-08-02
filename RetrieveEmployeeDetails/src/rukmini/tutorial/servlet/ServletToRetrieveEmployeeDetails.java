package rukmini.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletToRetrieveEmployeeDetails
 */
@WebServlet("/ServletToRetrieveEmployeeDetails")
public class ServletToRetrieveEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletToRetrieveEmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con  =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employees ");
			PrintWriter out = response.getWriter();
			out.println("<HTML><BODY>");
			out.println("<table border=1 style=width:100%>");
			while(rs.next()){
				//System.out.println(rs.getString("FIRST_NAME")+"  "+rs.getInt("SALARY"));
				out.println("<tr>");
				out.println("<td>"+rs.getString("FIRST_NAME")+"</td>");
				out.println("<td>"+rs.getInt("salary")+"</td>");
				out.println("</tr>");		
			}
			
			out.println("</TABLE>");
					out.println("</BODY></HTML>");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" ");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
