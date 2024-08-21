package utils;

import java.sql.*;

public class DBConnection {

    public static Connection getDBConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo","root","Abhishek@123");

            //here sonoo is database name, root is username and password
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
