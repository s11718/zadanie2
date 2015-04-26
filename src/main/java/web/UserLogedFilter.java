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




@WebFilter({"login.jsp" , "register.jsp"})
public class UserLogedFilter implements Filter {


    public UserLogedFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String username = (String) session.getAttribute("username");
			try {
				if(Login.checkLoged(username)){
					RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
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
