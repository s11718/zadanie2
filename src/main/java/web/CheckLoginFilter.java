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




@WebFilter({"profile.jsp","premium.jsp", "adminMenu.jsp", "allUsers.jsp", "LogOutSerlvet" })
public class CheckLoginFilter implements Filter {

 
    public CheckLoginFilter() {

    }

public void destroy() {
		// TODO Auto-generated method stub
	}



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String username = (String) session.getAttribute("username");
			try {
				if(Login.checkLoged(username)){
					chain.doFilter(request, response);
				}
			} catch (Exception e) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("accessDenied.jsp");
				dispatcher.forward(request, response);
				e.printStackTrace();
			}
	}



	public void init(FilterConfig fConfig) throws ServletException {

	}

}
