package com.EBI.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("NewFile.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DB db = new DB();
		Employee employee1 = new Employee();
		
		employee1.setID(Integer.parseInt(request.getParameter("id")));
		employee1.setFirstName(request.getParameter("firstname"));
		employee1.setSalary(Integer.parseInt(request.getParameter("salary")));
		employee1.setLastName(request.getParameter("lastname"));
		
		db.registerEmployee(employee1);
		
		PrintWriter out = response.getWriter();
		
		int ps_id = Integer.parseInt(request.getParameter("id"));
		out.println("The user id is: " + ps_id);

		String str = request.getParameter("firstname");
		out.println("The user firstname is: " + str);
		
		int ps_salary = Integer.parseInt(request.getParameter("salary"));
		out.println("The user salary is: " + ps_salary);
		
		String str2 = request.getParameter("lastname");
		out.println("The user lastname is: " + str2);

	}

}
