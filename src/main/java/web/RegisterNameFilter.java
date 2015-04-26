package web;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import service.Registration;



@WebFilter("RegistrationServlet")
public class RegisterNameFilter implements Filter {

    
    public RegisterNameFilter() {
        
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String user = request.getParameter("username");
		try {
			if(user!=null && !user.equals("") && !Registration.checkRegistered(user)){
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("/registerNameError.jsp");
				dispatcher.forward(request, response);
			}
		} catch (Exception e) {
			chain.doFilter(request, response);
			e.printStackTrace();
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
