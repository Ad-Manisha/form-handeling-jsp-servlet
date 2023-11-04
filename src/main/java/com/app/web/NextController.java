package com.app.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NextController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet method called");

		String uName = request.getAttribute("user-name").toString();
		uName = uName + "Adhikari";

		request.setAttribute("new-name", uName);

		RequestDispatcher rd = request.getRequestDispatcher("message.jsp");

		rd.forward(request, response);
	}

}
