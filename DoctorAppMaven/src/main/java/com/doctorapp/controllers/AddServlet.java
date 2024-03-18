package com.doctorapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    IDoctorService doctorService=new DoctorServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String doctorName=request.getParameter("doctorName");
		
		String speciality=request.getParameter("speciality");
		String fees=request.getParameter("fees");
		double doctorFee=Double.parseDouble(fees);
		String rating=request.getParameter("rating");
		int doctorRating=Integer.parseInt(rating);
		String experince=request.getParameter("experince");
		int doctorExperince=Integer.parseInt(experince);
		
		Doctor doctor=new Doctor();
		
		doctor.setDoctorName(doctorName);
		doctor.setExperince(doctorExperince);
		doctor.setFees(doctorFee);
		doctor.setRating(doctorRating);
		doctor.setSpeciality(speciality);
		doctorService.addDoctor(doctor);
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("admin.jsp");
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
