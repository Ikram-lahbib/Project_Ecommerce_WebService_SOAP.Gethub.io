package Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;


import CartService.Book;
import CartService.MethodsCart;
import CartService.MethodsCartService;
import CartService.MethodsCartServiceLocator;
import CartService.User;


/**
 * Servlet implementation class AddCart
 */
@WebServlet("/AddCart")
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int id_book=Integer.parseInt(request.getParameter("id_book"));
		HttpSession ses = request.getSession();
		int id_user =(int)ses.getAttribute("iduser");
		Book b=new Book();
		User u=new User();
		
		MethodsCartService mcs=new MethodsCartServiceLocator();
		try {
			MethodsCart port=mcs.getMethodsCartPort();
			
		   b=port.getBook(id_book);
		   u=port.getUser(id_user);
		   port.addCartObj(u, b);
		   response.sendRedirect("AddCart.jsp");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
