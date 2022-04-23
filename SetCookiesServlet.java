package com.nt.Servlet;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;
public class SetCookiesServlet extends HttpServlet {
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//creat cookies variable below  
				Cookie ck=null;
				Cookie ck1=null;
				Cookie ck2=null;
				Cookie ck3=null;
				Cookie ck4=null;
				//set values of cookies below 
				//set in-memory cookies 
				ck=new Cookie("sk ","amaravath");
				  ck1=new Cookie("ts","hyderabade ");
				  res.addCookie(ck1);
				  res.addCookie(ck2);
				  //cookies values fro the houre
				  //usere queit  brouser computer window 
				  //set presistem mcookies 
				  ck3=new Cookie("kundan","rani");
				  ck4=new Cookie("manoj","rajesh");
				  ck3.setMaxAge(3600);
				  ck4.setMaxAge(3600);
				  res.addCookie(ck3);
				  res.addCookie(ck4);
				  //General seting below 
				  PrintWriter pw=null;
				  pw=res.getWriter();
				  res.setContentType("text/html");
				  pw.println("successful in seting coockies .......");
	}//end of the  method 
	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}//end of the method 

}//end of the calass
