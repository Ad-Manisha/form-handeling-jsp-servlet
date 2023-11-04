package com.app.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;

public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPOst() method called ! ");

		String name = request.getParameter("name");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");

		System.out.println("Name : " + name);
		System.out.println("Username : " + userName);

		System.out.println("Password : " + password);

		System.out.println("Email : " + email);

		System.out.println("Gender : " + gender);

		for (int i = 0; i < hobbies.length; i++) {
			System.out.println("Hobbies : " + hobbies[i]);

		}

		request.setAttribute("user-name", userName);

		RequestDispatcher rd = request.getRequestDispatcher("/next");
		rd.forward(request, response);

	}

}
