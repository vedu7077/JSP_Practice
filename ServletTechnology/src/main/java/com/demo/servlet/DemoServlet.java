package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */

public class DemoServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("fname");
		String pass=request.getParameter("pass");
		if(pass.equals("123")) {
			out.print("welcome to TQ "+name);
		}
		else {
			out.print("invalid user");
		}
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		/*PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("fname");
		out.print("welcome to TQ "+name);
		*/
	}

}
