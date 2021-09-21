package CategoryService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DBConnection.DBconnection;
import Entities.Category;

@WebService
public class MethodsCategory {
	private Statement st;
    private DBconnection cnx;
    private ResultSet rs;
    
      public MethodsCategory() 
    {
    try {
		cnx=new DBconnection();
		st=cnx.getStatement();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    }
      @WebMethod (operationName="AddCategory")
      public void AddCategory(@WebParam(name="name") String name,@WebParam(name="image") String image,@WebParam(name="desc")String desc) 
      {
          
			try {
				st.executeUpdate("insert into category (Category_Name,Image,Description) Values('"+name+"','"+image+"','"+desc+"')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
      }
      /*public void AddCategory(Category c) throws SQLException, ClassNotFoundException
      {
          st.executeUpdate("insert into category (Category_Name,Image,Description) Values('"+c.getName_Category()+"','"+c.getImage_Category()+"','"+c.getDescription_Category()+"')");
      }*/
      @WebMethod (operationName="UpdateCategory")
      public void UpdateCategory(@WebParam(name="id") int id,@WebParam(name="name") String name) 
      {
          try {
			st.executeUpdate("update category set Category_Name='"+name+"' where id_Category="+id+";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      @WebMethod (operationName="DeleteCategory")
         public void DeleteCategory(@WebParam(name="id") int id) 
      {
          try {
			st.executeUpdate("delete from category where id_Category="+id+";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      @WebMethod (operationName="GetAllCategory")
         public ArrayList<Category> GetALLCategory() 
         {
        	 
        	 ArrayList<Category> cs=new ArrayList<Category>();
        	 try {
				rs=st.executeQuery("select * from category;");
				while(rs.next())
	             {
	                 Category c=new Category();
	                 c.setId_Catygory(rs.getInt(1));
	                 c.setName_Category(rs.getString(2));
	                 c.setImage_Category(rs.getString(3));
	                 c.setDescription_Category(rs.getString(4));
	                 cs.add(c);    
	             }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
        	 
			return cs;
        	 
         }
      @WebMethod (operationName="GetCategoryName")
         public String getCategoryName(@WebParam(name="id") int id) 
         {
        	  String nc = null;
              try {
				rs=st.executeQuery("select Category_Name  from category where id_Category="+id+";");
				if( rs.next()) {
	            	nc=rs.getString("Category_Name");
	              }
	              
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              return nc ;
         }
      @WebMethod (operationName="GetCategory")
         public Category getCategory(@WebParam(name="id") int id) 
         {
        	  Category c=new Category();
              try {
				rs=st.executeQuery("select *  from category where id_Category="+id+";");
				  if(rs.next()) {
					  c.setId_Catygory(rs.getInt(1));
					  c.setName_Category(rs.getString(2));
					  c.setImage_Category(rs.getString(3));
					  c.setDescription_Category(rs.getString(4));
				  }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              return c;
  
         }

}
