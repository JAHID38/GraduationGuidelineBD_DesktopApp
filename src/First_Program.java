import java.sql.*;
import java.io.*;

public class First_Program {
    public static void main (String args [])
    {
        Connection c = null;
        ResultSet r = null;
        Statement s = null;
        String reg, url, sql;
        
        String user = "ict_b";
        String password = "Oracle_1";
        
        reg = "oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@localhost:1521:orcl";
        
        // load the Driver Class.
        try
        {

            Class.forName(reg);
            c = DriverManager.getConnection(url, user, password);
            
            s = c.createStatement();
            sql  = "SELECT * FROM employee";
            
            r = s.executeQuery(sql);
            while (r.next())
            {
                System.out.print (r.getInt(1) +"\t" +r.getString(2));
                System.out.println();
            }
            c.close();
            
        }
        

        catch(Exception e)
        {
            System.out.println (e);
            
        }
        
    }
}
