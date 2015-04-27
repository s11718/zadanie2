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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import service.Registration;

@WebFilter({"adminMenu.jsp", "addPremium.jsp", "typeChanged.jsp", "allUsers.jsp"})
public class AdminAccessFilter implements Filter {


    public AdminAccessFilter() {
    
    }

	
	public void destroy() {
	
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String name = (String) session.getAttribute("username");
		if(Registration.getUser(name).getType().equals("Admin")){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("premiumAccessDenied.jsp");
			dispatcher.forward(request, response);
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
