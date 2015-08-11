package rukmini.tutorial.corejava.servlet.communication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Header
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	//	out.println("Hello This is from Main  "+request.getParameter("name")+"<br/>");
		//out.println("Hello this is from Main " +request.getParameter("place"));
		//String str=(String) request.getAttribute("ageString");
		//out.println("</br>");
		HttpSession session = request.getSession(true);
		String fname=request.getParameter("name");
		List <String> namesFromSession =(List<String>) request.getAttribute("names");
		for(String str:namesFromSession){
				if(fname.equals(str)){
					out.println("u r there in database");
					break;
				}
			}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
