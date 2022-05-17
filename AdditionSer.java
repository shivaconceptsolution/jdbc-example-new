package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ram")
public class AdditionSer extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
  {
	  res.setContentType("text/html");
	  PrintWriter out =  res.getWriter();
	  out.print("Addition Program<br><br>");
	  out.print("<body bgcolor='cyan'>");
	  out.print("<form action='' method='post'>");
	  out.print("<input type='text' name='txtnum1' placeholder='enter first number' style='background-color:blue;color:red;' /> <br>");
	  out.print("<input type='text' name='txtnum2' placeholder='enter send number' style='background-color:blue;color:white;' /> <br>");
	  out.print("<input type='submit' name='btnsubmit' value='click' /> <br>");
	  out.print("</form>");
	  out.print("</body>");
  }
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
  {
	  res.setContentType("text/html");
	  PrintWriter out =  res.getWriter();
	  out.print("Result is <br><br>");
	  int a = Integer.parseInt(req.getParameter("txtnum1"));
	  int b = Integer.parseInt(req.getParameter("txtnum2"));
	  int c = a+b;
	  out.print("result is "+c);
  }
  
}
