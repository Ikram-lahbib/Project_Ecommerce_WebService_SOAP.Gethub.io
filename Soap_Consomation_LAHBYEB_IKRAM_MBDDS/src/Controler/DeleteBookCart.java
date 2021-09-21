package Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import CartService.MethodsCart;
import CartService.MethodsCartService;
import CartService.MethodsCartServiceLocator;



/**
 * Servlet implementation class DeleteBookCart
 */
@WebServlet("/DeleteBookCart")
public class DeleteBookCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBookCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int id_cart=Integer.parseInt(request.getParameter("id_cart"));
		MethodsCartService mcs=new MethodsCartServiceLocator();
		try {
			MethodsCart port=mcs.getMethodsCartPort();
			port.deleteFromCart(id_cart);
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
