package rukmini.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletToGetEmployeeSpecifiedSalary
 */
@WebServlet("/ServletToGetEmployeeSpecifiedSalary")
public class ServletToGetEmployeeSpecifiedSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletToGetEmployeeSpecifiedSalary() {
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String salary = request.getParameter("salary");
		double sal=Double.parseDouble(salary);
		
		//double sal =Double.parseDouble(salary);

		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			PreparedStatement ps = con.prepareStatement("select * from employees WHERE SALARY>?" );
			//PreparedStatement ps = con.prepareStatement("select * from employees WHERE SALARY>? and SALARY<?" );
			//ps.setInt(1, salary);
			
			ps.setDouble(1, Double.valueOf(sal));
		//	ps.setDouble(2, Double.valueOf(sal));
			System.out.println("=======RESULSTS==================");
			ResultSet rs =ps.executeQuery();
			PrintWriter out = 	response.getWriter();
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
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
