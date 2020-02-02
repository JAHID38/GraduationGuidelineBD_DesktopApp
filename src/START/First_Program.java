package START;
import java.sql.*;
import java.io.*;

public class First_Program {
    public static Connection First_Program()
    {
        Connection c = null;
        String reg, url, sql;
        
        String user = "super_shop";
        String password = "Oracle_1";
        
        reg = "oracle.jdbc.OracleDriver";
        url = "jdbc:oracle:thin:@localhost:1521:orcl";
        
        // load the Driver Class.
        try
        {
            Class.forName(reg);
            c = DriverManager.getConnection(url, user, password);
            
        }        

        catch(Exception e)
        {
            System.out.println (e);
            
        }
        
        return c;
        
    }
}
