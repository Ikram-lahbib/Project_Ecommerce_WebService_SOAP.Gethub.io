package BookService;

//import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import CategoryService.MethodsCategory;
import DBConnection.DBconnection;
import Entities.Book;
import Entities.Category;

@WebService
public class MethodsBook {
	
	private Statement st ;
    private DBconnection conx ;
    private ResultSet rs ;
    
    public MethodsBook() 
    {
    try {
		conx=new DBconnection();
		st=conx.getStatement();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
    }
    @WebMethod (operationName="AddBook")
    public void AddBook (@WebParam(name="B") Book B) 
    {
         try {
			st.executeUpdate("Insert into book (Name,Writer,Image,Price,Stock,id_Category,Date,Summary) Values('"+B.getBook_Name()+"','"+B.getWriter_Name()+"','"+B.getBook_Image()+"','"+B.getBook_Price()+"','"+B.getBook_Stock()+"','"+B.getBook_Catygory().getId_Catygory()+"','"+B.getDate_Add_Book()+"','"+B.getBook_Summary()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod (operationName="GetBook")
    public Book GetBook(@WebParam(name="id") int id) 
    {
    	Book b=null;
		try {
			b = new Book();
			Category c =new Category();
			rs=st.executeQuery("Select * From book where id_Book ="+id);
			if(rs.next()) {
				b.setBook_id(rs.getInt(1));
				b.setBook_Name(rs.getString(2));
				b.setWriter_Name(rs.getString(3));
				b.setBook_Image(rs.getString(4));
				b.setBook_Price(rs.getDouble(5));
				b.setBook_Stock(rs.getInt(6));
				c.setId_Catygory(rs.getInt(7));
				//c.setName_Category(cd.getCategoryName(rs.getInt(7)));
				b.setBook_Catygory(c);
				b.setDate_Add_Book(rs.getString(8));
				b.setBook_Summary(rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return b;
    	
    }
   @WebMethod (operationName="UpdateBook")
   public void UpdateBook(@WebParam(name="id")int id,@WebParam(name="B") Book B) 
    {
    	try {
			st.executeUpdate("Update book set Name ="+B.getBook_Name()+"Writer="+B.getWriter_Name()+"Image="+B.getBook_Image()+"Price="+B.getBook_Price()+"set Stock="+B.getBook_Stock()+"id_Category="+B.getBook_Catygory().getId_Catygory()+" Date="+B.getDate_Add_Book()+" Summary="+B.getBook_Summary()+" where id_Book="+id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   @WebMethod (operationName="DeleteBook")
   public void DeleteBook(@WebParam(name="id") int id )
   {
	   try {
		st.executeUpdate("delete from book where id_Book ="+id);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   @WebMethod (operationName="GetALLBook")
   public ArrayList<Book> GetAllBook() 
   {
	   ArrayList<Book> bs = new ArrayList<Book>();
	try {
		rs=st.executeQuery("Select * From book ");
		while (rs.next()) {
			Book b=new Book();
		   	Category c =new Category();
		   	b.setBook_id(rs.getInt(1));
			b.setBook_Name(rs.getString(2));
			b.setWriter_Name(rs.getString(3));
			b.setBook_Image(rs.getString(4));
			b.setBook_Price(rs.getDouble(5));
			b.setBook_Stock(rs.getInt(6));
			c.setId_Catygory(rs.getInt(7));
			//c.setName_Category(cd.getCategoryName(rs.getInt(7)));
			b.setBook_Catygory(c);
			b.setDate_Add_Book(rs.getString(8));
			b.setBook_Summary(rs.getString(9));
			
			bs.add(b);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return bs;
	   
   }
   @WebMethod (operationName="GetBookByCategory")
   public ArrayList<Book> GetBookByCategory( @WebParam(name="id_Category") int id_Category) 
   {
	   ArrayList<Book> bs = new ArrayList<Book>();
	try {
		MethodsCategory cd =null;
		cd=new MethodsCategory();
		rs=st.executeQuery("Select * From book where id_Category="+id_Category);
		while (rs.next()) {
			Book b=new Book();
		   	Category c =new Category();
			b.setBook_Name(rs.getString(2));
			b.setWriter_Name(rs.getString(3));
			b.setBook_Image(rs.getString(4));
			b.setBook_Price(rs.getDouble(5));
			b.setBook_Stock(rs.getInt(6));
			c.setId_Catygory(rs.getInt(7));
			//c.setName_Category(cd.getCategoryName(rs.getInt(7)));
			b.setBook_Catygory(c);
			b.setDate_Add_Book(rs.getString(8));
			b.setBook_Summary(rs.getString(9));
			
			bs.add(b);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return bs;
	   
   }
   @WebMethod (operationName="GetBookByDate")
   public ArrayList<Book> GetBookByDate(@WebParam(name="date") String date) 
   {
    ArrayList<Book> bs = new ArrayList<Book>();
	try {
		rs=st.executeQuery("Select * From book where MONTH(Date) = "+date);
		while (rs.next()) {
			Book b=new Book();
		   	Category c =new Category();
			b.setBook_Name(rs.getString(2));
			b.setWriter_Name(rs.getString(3));
			b.setBook_Image(rs.getString(4));
			b.setBook_Price(rs.getDouble(5));
			b.setBook_Stock(rs.getInt(6));
			c.setId_Catygory(rs.getInt(7));
			//c.setName_Category(cd.getCategoryName(rs.getInt(7)));
			b.setBook_Catygory(c);
			b.setDate_Add_Book(rs.getString(8));
			b.setBook_Summary(rs.getString(9));
			
			bs.add(b);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return bs;
	   
   }
   
   

}
