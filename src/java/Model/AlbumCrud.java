/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class AlbumCrud {
     public static boolean insert(Album album){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("insert into album values(p_seq.nextval,?,?,?)");
        ps.setString(1,album.getUser_id() );
         ps.setString(2,album.getPhoto_name() );
        
        ps.setBinaryStream(3,album.getPhoto());
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
         public static boolean delete(Album album){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("delete from album where p_id=?");


ps.setString(1,album.getP_id());


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
    
}
