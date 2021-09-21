package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {
	
    private Connection connection=null;
   private Statement statement=null;
 
   private String url="jdbc:mysql://localhost/siteecommerce?zeroDate TimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
   
   public DBconnection() throws SQLException, ClassNotFoundException
   {
       Class.forName("com.mysql.jdbc.Driver");
       connection = DriverManager.getConnection(url, "root", "");
       statement = connection.createStatement();
   }
   
   public Statement getStatement()
   {
   return statement;
   }

}
