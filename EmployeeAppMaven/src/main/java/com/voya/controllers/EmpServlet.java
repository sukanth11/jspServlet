package com.voya.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.voya.employee.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/empServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String employeeName=request.getParameter("employeeName");
		String employeeId=request.getParameter("employeeId");
		Integer empId=Integer.parseInt(employeeId);
		String sal=request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		String city=request.getParameter("city");
		
		Employee employee=new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmployee(empId);
		employee.setSalary(salary);
		employee.setCity(city);
		
		request.setAttribute("employee", employee);
		request.setAttribute("message", "good morning");
		
		HttpSession session=request.getSession();
		session.setAttribute("message1", "welcome to voya india");
		request.setAttribute("message1", "thank you for visiting");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("empexplang.jsp");
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
