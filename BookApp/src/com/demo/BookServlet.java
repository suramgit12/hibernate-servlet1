package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	     String qstmt="from com.demo.Book";
	     Query query=session.createQuery(qstmt);
	     List<Book> blist=query.list();
	     pw.print("<center><h2>");
		 for(Book book:blist)
		 {
			 
			pw.print("<br><br>"+book.getBookId()+"&nbsp;&nbsp;&nbsp;"+book.getBookName()+"&nbsp;&nbsp;&nbsp;"+book.getAuthor());
		 }
		    session.close();  
		    pw.print("<br><br><a href='Menu.html'>Return</a>");

		// TODO Auto-generated method stub
	}

}
