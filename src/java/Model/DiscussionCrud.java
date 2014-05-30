/*
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Admin
 */
public class DiscussionCrud {
    public static boolean insert(Discussion discussion){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("insert into discussion values(?,SYSDATE,?)");


ps.setString(1,discussion.getUser_id());
ps.setString(2,discussion.getContent());




	int i = ps.executeUpdate();
	con.close();
        if(i>0)
		return true;
	else
		return false;
        }
        catch(Exception e){
                e.printStackTrace();
                return false;
        }

    }
    
       
       public static String  select(){
        Connection con = ConnectionManager.getConnection();
        try{
            PreparedStatement ps1 = con.prepareStatement("select * from Discussion");
         
            ResultSet rs=ps1.executeQuery();
           
            rs.next();
           
           String content=rs.getString(3);
            
        return content;


	
        }
        catch(Exception e){
                e.printStackTrace();
                return null;
        }

    }
       
}
