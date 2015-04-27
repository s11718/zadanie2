package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ChangeType;



@WebServlet("/addPremiumServlet")
public class addPremiumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public addPremiumServlet() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ChangeType.change(request.getParameter("username"));
		response.sendRedirect("typeChanged.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
