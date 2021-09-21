package Controler;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.SQLException;
//import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;
//import CategoryService.Category;
import CategoryService.MethodsCategory;
import CategoryService.MethodsCategoryService;
//import Beans.Category;
//import Model.CategorysDAO;
import CategoryService.MethodsCategoryServiceLocator;


/**
 * Servlet implementation class AddCategory
 */
@WebServlet("/AddCategory")
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 String Name=request.getParameter("name");
		 String Description=request.getParameter("description");
		 String Image=request.getParameter("image");
         MethodsCategoryService mcs =new MethodsCategoryServiceLocator();
         try {
        	 MethodsCategory  port= mcs.getMethodsCategoryPort();
			port.addCategory(Name, Image, Description);
			response.sendRedirect("AllCategory.jsp");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
