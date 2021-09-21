package Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import BookService.MethodsBook;
import BookService.MethodsBookService;
import BookService.MethodsBookServiceLocator;



/**
 * Servlet implementation class DeleteBook
 */
@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int id= Integer.parseInt(request.getParameter("id_book"));
		MethodsBookService mbs=new MethodsBookServiceLocator();
		try {
			MethodsBook port=mbs.getMethodsBookPort();
			port.deleteBook(id);
			response.sendRedirect("AllBook.jsp");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
