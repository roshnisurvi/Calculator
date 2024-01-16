package com.els.calculator_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Basic_calculator extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException
	{
		PrintWriter pw = res.getWriter();
		pw.println("hi");
		int x,y;
		String result="";
		
		x=Integer.parseInt(req.getParameter("num1"));
		y=Integer.parseInt(req.getParameter("num2"));

		
		result=req.getParameter("operation");
		
		if(result.equals("add"))
		
			pw.println("Result of addition is:"+(x+y));
		
		else if(result.equals("sub"))
			
			pw.println("Result of subtraction is:"+(x-y));
		
		else if(result.equals("multi"))
			
			pw.println("Result of multiplication is:"+(x*y));
		
		else if(result.equals("div"))
			
			pw.println("Result of division is:"+(x/y));
		else
			pw.println("sorry");
		
		}

}
