package Controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import CategoryService.Category;
import CategoryService.MethodsCategory;
import CategoryService.MethodsCategoryService;
import CategoryService.MethodsCategoryServiceLocator;

/**
 * Servlet implementation class UpdateCategory
 */
@WebServlet("/UpdateCategory")
public class UpdateCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCategory() {
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
		Category c=new Category();
		int id =Integer.parseInt(request.getParameter("id_catygory"));
		 String Name=request.getParameter("name");
		 MethodsCategoryService mcs =new MethodsCategoryServiceLocator();
		 try {
			 MethodsCategory  port= mcs.getMethodsCategoryPort();
			port.updateCategory(id, Name);
			response.sendRedirect("AllCategory.jsp");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
