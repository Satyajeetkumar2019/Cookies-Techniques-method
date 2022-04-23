package com.nt.Servlet;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ShowCookiesServlet extends HttpServlet {
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//create variable below 
		PrintWriter pw=null;
		String title=null;
		pw=res.getWriter();
		res.setContentType("text/htm l");
		title="Active Cookies ";
		pw.println("<html><head><title>"+title);
		pw.println("</title></head><body>");
		pw.println("<table border=1 align='center'>");
		pw.println("<tr><td>Cookies Name</td>");
		pw.println("<td>Cookies Values</td></tr>");
		Cookie[] cks=req.getCookies();
		if(cks!=null) {
			for(Cookie ck:cks) {
				pw.println("<tr><td>"+ck.getName()+" </td>");
				pw.println("<tr><td>"+ck.getValue()+" </td></tr>");
			}//end for loop 
		pw.println("</table></body></html>");
		}//if end 
		else {
		System.out.println("no cookies present :");
		System.out.println("no cookies present here :");
		}//end of the for loop 
	}//end of the method
	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}//end of the method 
}//end of the class
