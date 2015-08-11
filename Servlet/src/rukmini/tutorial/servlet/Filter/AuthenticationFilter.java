package rukmini.tutorial.servlet.Filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter(filterName="AuthenticationFilter",urlPatterns={"/*"})
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String[] ipaddress = {"a","b"};
		String ipAddress =request.getRemoteAddr();
		System.out.println("IP "+ipAddress+",Time"+new Date().toString());
        HttpServletRequest  req =(HttpServletRequest) request;  
       HttpServletResponse res=(HttpServletResponse) response;
       String url=req.getRequestURI();
       System.out.println("URL name= "+url);
       String firstName = req.getParameter("name");
       if(firstName!=null &&firstName.equals("danger")){
    	   res.sendRedirect("danger.html");
       }else{
    	   chain.doFilter(request, response);
       }
       
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
