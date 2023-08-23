package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleMethodDemo
 */

public class LifeCycleMethodDemo extends HttpServlet {
	
	public void init(ServletConfig c) {
		System.out.println("init() method invoked");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>welcome to servlet</h1>");
		System.out.println("doget() method invoked");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>welcome to servlet</h1>");
		System.out.println("dopost() method invoked");
	}

	public void destroy() {
		System.out.println("destroy method invoked()");
	}
}
