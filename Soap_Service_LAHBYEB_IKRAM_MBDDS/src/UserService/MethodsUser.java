package UserService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DBConnection.DBconnection;
import Entities.User;
@WebService
public class MethodsUser {

	private Statement st;
    private DBconnection cnx;
    private ResultSet rs;
    public MethodsUser() 
    {
    try {
		cnx=new DBconnection();
		st=cnx.getStatement();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    @WebMethod (operationName="AddUser")
    public void AddUser(@WebParam(name="U") User U) 
    {
    	try {
			st.executeUpdate("insert into user (Username,Login,Password,Date,Role) Values('"+U.getUser_Name()+"','"+U.getUser_login()+"','"+U.getUser_Password()+"','"+U.getDate_Add_User()+"','"+U.getRole()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod (operationName="AuthUser")
    public User AuthUser(@WebParam(name="login") String login ,@WebParam(name="password") String password) 
    {
    	User u = null;
		try {
			u = new User();
			rs=st.executeQuery("select * from user where Login='"+login+"'and Password ='"+password+"'");
			if (rs.next()) {
				u.setId_user(rs.getInt(1));
				u.setUser_Name(rs.getString(2));
				u.setUser_login(rs.getString(3));
				u.setUser_Password(rs.getString(4));
				u.setDate_Add_User(rs.getString(5));
				u.setRole(rs.getInt(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
    	
    }
    @WebMethod (operationName="GetUser")
    public User GetUser(@WebParam(name="id") int id) {
    	User u = null;
		try {
			u = new User();
			rs=st.executeQuery("select * from user where id_user="+id);
			if (rs.next()) {
				u.setId_user(rs.getInt(1));
				u.setUser_Name(rs.getString(2));
				u.setUser_login(rs.getString(3));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
    	
    }
}
