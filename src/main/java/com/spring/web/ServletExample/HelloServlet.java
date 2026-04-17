package com.spring.web.ServletExample;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
/*	In a Java Servlet, the service() method is the core entry point for handling client requests.
	It is called by the servlet container (e.g., Apache Tomcat) for every request that reaches the 
	servlet.*/
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("in service");
	}

}
