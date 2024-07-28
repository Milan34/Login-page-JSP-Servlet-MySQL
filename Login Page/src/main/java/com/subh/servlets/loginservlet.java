package com.subh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subh.dao.dao;
import com.subh.helper.connection_provider;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/login")
public class loginservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getParameter("name");
		String pass = (String) request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.print("<h1>"+name+"  <br> "+pass+"</h1>");
		
		dao obj = new dao(connection_provider.getconnection());
		
		String[] client = obj.get(name);
		
			out.println(client[0]);
		
		
	}

}
