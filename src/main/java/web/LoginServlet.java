package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Login;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pwd = request.getParameter("password");
		String username = request.getParameter("username");
		HttpSession session = request.getSession();
		try {
			if(Login.checkPassword(username, pwd)){
				Login.logIn(request.getParameter("username"), request.getParameter("password"));
				String name = request.getParameter("username");
				session.setAttribute("username", name);
				RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
				dispatcher.forward(request, response);
			}
			
		} catch (Exception e) {
			response.sendRedirect("loginError.jsp");
			e.printStackTrace();
		}
			
	}

}
