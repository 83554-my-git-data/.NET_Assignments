package com.sunbeam;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/hi",loadOnStartup = 10,initParams  = {
		@WebInitParam(name="color",value="blue"),
		@WebInitParam(name="course",value="DAC")
})
public class HelloServelet extends HttpServlet {
	private String color;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Inside init");
		System.out.println(config.getInitParameter("color"));
		color=config.getInitParameter("color");
	}
	@Override
	public void destroy() {
		System.out.println("Inside destroy");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Process(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Process(req,resp);
	}
	protected void Process(HttpServletRequest req, HttpServletResponse resp)throws ServletException , IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.printf("<html><header></header><body bgcolor='%s' ><h1>GET OR POST Request is made<h1></body></html>",color);
	}
}
