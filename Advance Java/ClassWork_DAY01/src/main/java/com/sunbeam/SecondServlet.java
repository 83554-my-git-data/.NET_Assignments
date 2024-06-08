package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private String color;
	@Override
	public void init(ServletConfig config) throws ServletException {
		color=config.getInitParameter("color");
		super.init();
	}
	@Override
	public void destroy() {
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	protected void process(HttpServletRequest req, HttpServletResponse resp)throws ServletException , IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.printf("<html><header><title>Page2</title><header><body bgcolor='%s'><h1>From web.xml</h1></body><html>",color);
	}
}
