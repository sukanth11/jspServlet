package com.empapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("employeeName");
		String id=request.getParameter("employeeId");
		Integer employeeId=Integer.parseInt(id);
		String city=request.getParameter("city");
		String course=request.getParameter("course");
		String sal=request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		
		Employee employee=new Employee();
		employee.setEmployeeId(employeeId);
		employee.setCity(city);
		employee.setEmployeeName(name);
		employee.setCourse(course);
		employee.setSalary(salary);
		
		request.setAttribute("employee", employee);
		RequestDispatcher dispatcher=request.getRequestDispatcher("employeeSuccess.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
