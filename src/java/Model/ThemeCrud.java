package Model;
import java.sql.*;
public class ThemeCrud {
    public static boolean insert(ThemeSet themeset){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("insert into ThemeSet values(?,?)");


ps.setString(1,themeset.getUser_id());
ps.setString(2,themeset.getTheme());


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
     public static boolean update(ThemeSet themeset){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("update ThemeSet set theme=? where user_id=?");
      
ps.setString(2,themeset.getUser_id());
ps.setString(1,themeset.getTheme());


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
     public static String select(ThemeSet themeset){
        Connection con = ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("select theme from ThemeSet where user_id=?");
      
        ps.setString(1,themeset.getUser_id());



	ResultSet rs = ps.executeQuery();
        if(rs.next())
        return rs.getString(1);
        else
            return null;
        
        
        }
        catch(Exception e){
                e.printStackTrace();
              return null;
        }

    }
}