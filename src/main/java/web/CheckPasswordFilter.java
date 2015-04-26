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

@WebFilter("RegistrationServlet")
public class CheckPasswordFilter implements Filter {

    public CheckPasswordFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String pwd = request.getParameter("password");
		String cpwd = request.getParameter("Cpassword");
		if(pwd != null && !pwd.equals("") && pwd.equals(cpwd) && (pwd.hashCode() == cpwd.hashCode())){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/passwordError.jsp");
			dispatcher.forward(request, response);
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
