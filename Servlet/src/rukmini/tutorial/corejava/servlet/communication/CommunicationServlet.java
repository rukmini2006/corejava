package rukmini.tutorial.corejava.servlet.communication;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommunicationServlet
 */
@WebServlet("/CommunicationServlet")
public class CommunicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	
	int age=Integer.parseInt(request.getParameter("age"));
	String value = "Your age is "+age;
	
	java.util.List name=new ArrayList();
	name.add("one");
	name.add("two");
	request.setAttribute("names",name);
	
	
	
		request.setAttribute("ageString","value");
	
	/*RequestDispatcher header =request.getRequestDispatcher("Header");
	header.include(request, response);*/
	
	
	RequestDispatcher main =request.getRequestDispatcher("Main");
	main.include(request, response);
	/*
	RequestDispatcher footer =request.getRequestDispatcher("footer");
	footer.include(request, response);*/
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
