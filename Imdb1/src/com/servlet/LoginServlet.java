package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sts.Dao.RegistrationDao;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Username,password;
		Username=request.getParameter("Username");
		password=request.getParameter("password");
		
		PrintWriter out=response.getWriter();
		RegistrationDao res=new RegistrationDao();
		try {
			int i=res.read(Username, password);
			if(i>0) {
			response.sendRedirect("Login.jsp");
			
			}
			else
				response.sendRedirect("Registration.jsp");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Username,password;
	Username=request.getParameter("Username");
	password=request.getParameter("password");
	
	PrintWriter out=response.getWriter();
	RegistrationDao res=new RegistrationDao();
	try {
		int i=res.read(Username, password);
		if(i>0) {
		response.sendRedirect("Login.jsp");
		
		}
		else
			response.sendRedirect("Registration.jsp");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

}

