
package ConcertProjectGUI;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection conn;
    
    private DBConnection(){
    }
    
    public static Connection getDBConnection(){
        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection("jdbc:oracle:thin:@dbsvcs.cs.uno.edu:1521:orcl", "atran3", "nVrp9FhJ");
            
            System.out.println("Successful Connection");
        } 
        catch(Exception e){
            System.out.println(e);
        }
        return conn;
    }
}
