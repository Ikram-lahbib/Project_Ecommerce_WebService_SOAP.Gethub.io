package CartService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DBConnection.DBconnection;
import Entities.Book;
import Entities.Cart;
import Entities.Category;
import Entities.User;
@WebService
public class MethodsCart {

	private Statement st ;
    private DBconnection conx ;
    private ResultSet rs ;
    
    public MethodsCart() 
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
    @WebMethod (operationName="AddCartObj")
    public void AddCartObj(@WebParam(name="u")User u,@WebParam(name="b") Book b) 
    {
    	try {
			st.executeUpdate("insert into cart (id_User,Image_book,Name_book,Price_book) values ('"+u.getId_user()+"','"+b.getBook_Image()+"','"+b.getBook_Name()+"','"+b.getBook_Price()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod (operationName="AddCart")
    public void AddCart(@WebParam(name="id_user") int id_user,@WebParam(name="image_book") String image_book,@WebParam(name="name_book")String name_book,@WebParam(name="price_book")double price_book) 
    {
    	try {
			st.executeUpdate("insert into cart (id_User,Image_book,Name_book,Price_book) values('"+id_user+"','"+image_book+"','"+name_book+"','"+price_book+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod (operationName="GetCartByUser")
    public ArrayList<Cart> GetCartByUser(@WebParam(name="id_user") int id_user) 
    {
    	ArrayList<Cart> cs = null;
		try {
			rs=st.executeQuery("select * from cart where id_user="+id_user);
			
			cs = new ArrayList<>();
			while(rs.next()) {
			  Cart c =new Cart();
			   c.setId_Cart(rs.getInt(1));
			   c.setId_User(rs.getInt(2));
			   c.setImage_book(rs.getString(3));
			   c.setName_book(rs.getString(4));
			   c.setPrice_book(rs.getDouble(5));
			   cs.add(c) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return cs;
    	
    }
    @WebMethod (operationName="DeleteFromCart")
    public void DeleteFromCart(@WebParam(name="id_cart") int id_cart) 
    {
    	try {
			st.executeUpdate("Delete from cart where id_cart="+id_cart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @WebMethod(operationName="GetUser")
    public User getUser(@WebParam(name="id_user") int id_user) {
    	User u=new User();
    	
    	try {
			rs=st.executeQuery("select * from user where id_user="+id_user);
			if(rs.next()) {
				u.setId_user(rs.getInt(1));
				u.setUser_Name(rs.getString(2));
				u.setUser_login(rs.getString(3));
				u.setUser_Password(rs.getString(3));
				u.setDate_Add_User(rs.getString(5));
			    u.setRole(rs.getInt(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
    	
    }
    @WebMethod(operationName="GetBook")
    public Book getBook(@WebParam(name="id_book") int id_book) {
    	Book b=new Book();
    	Category c =new Category();
    	try {
			rs=st.executeQuery("select * from book where id_Book="+id_book);
			if(rs.next()) {
				b.setBook_id(rs.getInt(1));
				b.setBook_Name(rs.getString(2));
				b.setWriter_Name(rs.getString(3));
				b.setBook_Image(rs.getString(4));
				b.setBook_Price(rs.getDouble(5));
				b.setBook_Stock(rs.getInt(6));
				c.setId_Catygory(rs.getInt(7));
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
    
    
    
    
} 
