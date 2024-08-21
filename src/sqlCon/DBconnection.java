package sqlCon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public static Connection getDBConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cred","root","Abhishek@123");
            //here cred is database name, root is username and password
            System.out.println("Inside DB Connection");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
