package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistorServlet
 */
@WebServlet("/register")
public class RegistorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("empolyeename");
		String city=request.getParameter("city");
		String sal=request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		String mob=request.getParameter("mobile");
		double mobile=Double.parseDouble(mob);
		String course=request.getParameter("course");
		String hobby[]=request.getParameterValues("hobby");
		
		PrintWriter writter=response.getWriter();
		writter.print("<html><body>");
		writter.print("employee name "+name+"<br>");
		writter.print("employee city "+city+"<br>");
		writter.print("employee salary "+sal+"<br>");
		writter.print("employee number "+mob+"<br>");
		writter.print("employee course "+course+"<br>");
		for(String hobbies:hobby) {
		writter.print("employee hobbies "+hobbies+"<br>");
		}
		writter.print("<body><html>");
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
