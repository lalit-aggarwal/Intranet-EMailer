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
public class DdeleteCrud {
    public static boolean insert(Ddelete ddelete){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("insert into Ddelete values(dd_seq.nextval,?,?,SYSDATE,NULL,?)");


ps.setString(1,ddelete.getSubject());
ps.setString(2,ddelete.getContent());
ps.setString(3,ddelete.getUser_id());



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
    
       public static boolean delete(Ddelete ddelete){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("delete from Ddelete where id=?");


ps.setString(1,ddelete.getId());


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
              public static String  select(Ddelete ddelete){
        Connection con = ConnectionManager.getConnection();
        try{
            PreparedStatement ps1 = con.prepareStatement("select * from Ddelete where id=?");
            ps1.setString(1,ddelete.getId());
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
