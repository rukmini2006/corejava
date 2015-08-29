
package com.tutorial.jsp.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tutorial.jsp.dao.EmployeeDAO;
import com.tutorial.jsp.dao.EmployeeDAOImpl;
import com.tutorial.jsp.DO.EmployeeDO;

/**
 * Servlet implementation class GetEmployeeDetail
 */
@WebServlet( displayName="GetEmployeeDetail" ,name="GetEmployeeDetail" , urlPatterns={"/GetEmployeeDetail"})
public class GetEmployeeDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(name);
		callMe();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" iN pOST METHOD ");
		String empid = (String)request.getParameter("empid");
		String type = (String) request.getParameter("type");
		List<EmployeeDO> employeeList = new ArrayList<EmployeeDO>();;
		HttpSession session = request.getSession();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		if(empid != null && !"".equals(empid)){
			System.out.println(" Valid empl id");
			EmployeeDO empObj = dao.getEmployeeDetails(empid);
			System.out.println("empl name is "+empObj.getFname());
			employeeList.add(empObj);
		}else{
			System.out.println("Not a valid id");
			employeeList = dao.getEmployees();
		}
		
		request.setAttribute("empdetail", employeeList);
		
		//session.setAttribute("empdetail", employeeList);

		System.out.println("typevalue is "+type);
		
		String dispatcherURL = "";
		if ("employee".equals(type))
			dispatcherURL = "/empdetail.jsp";
		else
			dispatcherURL = "/studdetail.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(dispatcherURL);
		rd.forward(request,response);
		
	}
	
	public void callMe(){
		System.out.println("");
	}
}