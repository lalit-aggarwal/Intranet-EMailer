
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProfilePicCrud {
    public static boolean insert(ProfilePic profilepic){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("insert into ProfilePic values(?,?)");
        ps.setString(1,profilepic.getUser_id() );
        ps.setBinaryStream(2,profilepic.getPic());
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
    public static boolean update(ProfilePic profilepic){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("update ProfilePic set pic=? where user_id=?");
        ps.setString(2,profilepic.getUser_id() );
        ps.setBinaryStream(1, profilepic.getPic());
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
    public byte[] select(ProfilePic profilepic){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("select pic from ProfilePic where user_id=?");
        ps.setString(1,profilepic.getUser_id() );
       
        	ResultSet rs = ps.executeQuery();
        if(rs.next())
        return rs.getBytes(1);
        else
            return null;
        }
        catch(Exception e){
                e.printStackTrace();
                return null;
        }

    
        
    }
    
}
