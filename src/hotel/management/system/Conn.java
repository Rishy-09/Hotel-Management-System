package hotel.management.system;

import java.sql.*;
public class Conn {
//    creating connection
    Connection c;
    Statement s;
    Conn(){
        try{
//            so here I registered the driver class: step 1
            Class.forName("com.mysql.cj.jdbc.Driver");
//            that pin is optional to write if your default one is 3306 in sql
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "mysqlpassword");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
