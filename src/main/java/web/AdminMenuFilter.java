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

import service.Login;
import service.Registration;


@WebFilter("index.jsp") 
public class AdminMenuFilter implements Filter {

   
    public AdminMenuFilter() {
        
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String username = (String) session.getAttribute("username");
		try {
			if(Login.checkLoged(username)){
				if(Registration.getUser(username).getType().equals("Admin")){
				RequestDispatcher dispatcher = request.getRequestDispatcher("adminMenu.jsp");
				dispatcher.forward(request, response);
				}
				else{
					chain.doFilter(request, response);
				}
			}else{
				chain.doFilter(request, response);
			}
		} catch (Exception e) {
			chain.doFilter(request, response);
			e.printStackTrace();
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
