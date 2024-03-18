package com.doctorapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.DoctorApp;

/**
 * Servlet implementation class Doctor
 */
@WebServlet("/doctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("doctorName");
		String id=request.getParameter("doctorId");
		Integer doctorId=Integer.parseInt(id);
		String speciality=request.getParameter("speciality");
		String fees=request.getParameter("fees");
		double doctorFee=Double.parseDouble(fees);
		String rating=request.getParameter("rating");
		int doctorRating=Integer.parseInt(rating);
		String experince=request.getParameter("experince");
		int doctorExperince=Integer.parseInt(experince);
		
		DoctorApp doctorApp=new DoctorApp();
		doctorApp.setDoctorId(doctorId);
		doctorApp.setDoctorName(name);
		doctorApp.setExperince(doctorExperince);
		doctorApp.setFees(doctorFee);
		doctorApp.setRating(doctorRating);
		doctorApp.setSpeciality(speciality);
		
		request.setAttribute("doctorApp", doctorApp);
		RequestDispatcher dispatcher=request.getRequestDispatcher("doctorSuccess.jsp");
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
