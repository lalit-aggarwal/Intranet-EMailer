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
public class Inboxcrud {
       public static boolean insert(Inbox inbox){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("insert into Inbox values(i_seq.nextval,?,?,?,SYSDATE,NULL,?)");


ps.setString(1,inbox.getFfrom());
ps.setString(2,inbox.getSubject());
ps.setString(3,inbox.getContent());
ps.setString(4,inbox.getUser_id());



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
    
       public static boolean delete(Inbox inbox){
        Connection con = ConnectionManager.getConnection();
        try{
            PreparedStatement ps1 = con.prepareStatement("select * from Inbox where id=?");
            ps1.setString(1,inbox.getId());
            ResultSet rs=ps1.executeQuery();
            Ddelete ddelete=new Ddelete();
            rs.next();
            String user_id=rs.getString(7);
            String subject=rs.getString(3);
            String content=rs.getString(4);
            ddelete.setUser_id(user_id);
            ddelete.setSubject(subject);
            ddelete.setContent(content);
            boolean status2=DdeleteCrud.insert(ddelete);
            
        PreparedStatement ps = con.prepareStatement("delete from inbox where id=?");


ps.setString(1,inbox.getId());


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
              public static String  select(Inbox inbox){
        Connection con = ConnectionManager.getConnection();
        try{
            PreparedStatement ps1 = con.prepareStatement("select * from Inbox where id=?");
            ps1.setString(1,inbox.getId());
            ResultSet rs=ps1.executeQuery();
           
            rs.next();
           
           String content="From:"+rs.getString(2)+"\n"+rs.getString(4);
            
        return content;


	
        }
        catch(Exception e){
                e.printStackTrace();
                return null;
        }

    }
    
}
