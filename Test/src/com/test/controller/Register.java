package com.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
       
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("first_name", "");
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/test.jsp");
		rd.forward(request, response);
	}

	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("errors",false);
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
		 String name_regx = "[a-zA-Z]+\\.?";
	 
		if( (name.matches(name_regx)&&name.length()>2)==false) {
	
			request.setAttribute("errors",true);
			request.setAttribute("name",true);
			request.setAttribute("first_name", "");
		}else {
			request.setAttribute("first_name",name);
		}
		if(city.length()==0) {
			request.setAttribute("errors",true);
			request.setAttribute("city",true);
		}
		if((boolean)request.getAttribute("errors")) {
			RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/test.jsp");
			rd.forward(request, response);
		}
		
	}

}
