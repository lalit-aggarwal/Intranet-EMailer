package Model;
import java.sql.*;
public class ConnectionManager {
    public static Connection getConnection(){
        try{
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","java");
        return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;}
    }
}
