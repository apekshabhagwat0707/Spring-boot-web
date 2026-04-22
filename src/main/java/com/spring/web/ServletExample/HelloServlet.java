package com.spring.web.ServletExample;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {

	/*
	 * In a Java Servlet, the service() method is the core entry point for handling
	 * client requests. It is called by the servlet container (e.g., Apache Tomcat)
	 * for every request that reaches the servlet.
	 */
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
		//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
		System.out.println("in service");
		
		
		//The Java method res.setContentType("text/html") is used within a Servlet to inform the client's browser that the response body contains HTML content. This allows the browser to render the output as a webpage rather than displaying it as plain text
		res.setContentType("text/html");
		 
		//To send data to client or response to client 
		res.getWriter().println("<h1><b>Hello world</h1></b>");
		
		//another way to res or send data to client
		
		/*
		 * PrintWriter out=res.getWriter();
		 * out.println("Hello world");
		 */
	}

}
