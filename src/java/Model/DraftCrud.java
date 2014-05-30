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
public class DraftCrud {
    public static boolean insert(Draft draft){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("insert into Draft values(d_seq.nextval,?,?,SYSDATE,NULL,?)");


ps.setString(1,draft.getSubject());
ps.setString(2,draft.getContent());
ps.setString(3,draft.getUser_id());



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
    
       public static boolean delete(Draft draft){
        Connection con = ConnectionManager.getConnection();
        try{
            PreparedStatement ps1 = con.prepareStatement("select * from Draft where id=?");
            ps1.setString(1,draft.getId());
            ResultSet rs=ps1.executeQuery();
            Ddelete ddelete=new Ddelete();
            rs.next();
            String user_id=rs.getString(6);
            String subject=rs.getString(2);
            String content=rs.getString(3);
            ddelete.setUser_id(user_id);
            ddelete.setSubject(subject);
            ddelete.setContent(content);
            boolean status2=DdeleteCrud.insert(ddelete);
            
        PreparedStatement ps = con.prepareStatement("delete from Draft where id=?");


ps.setString(1,draft.getId());


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
       public static String  select(Draft draft){
        Connection con = ConnectionManager.getConnection();
        try{
            PreparedStatement ps1 = con.prepareStatement("select * from Draft where id=?");
            ps1.setString(1,draft.getId());
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
