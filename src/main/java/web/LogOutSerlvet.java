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


@WebServlet("/LogOutSerlvet")
public class LogOutSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LogOutSerlvet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String username = (String) session.getAttribute("username");
	try {Login.logOut(username);
		RequestDispatcher dispatcher = request.getRequestDispatcher("logOutSuccessful.jsp");
		dispatcher.forward(request, response);
	}
	 catch (Exception e) {
		e.printStackTrace();
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
