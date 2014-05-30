package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserCrud {

    public static boolean insert(Info info) {
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("insert into Info values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, info.getFname());
            ps.setString(2, info.getLname());
            ps.setString(3, info.getUser_id());
            ps.setString(4, info.getPassword());
            ps.setString(5, info.getSex());
            ps.setString(6, info.getAddress());
            ps.setString(7, info.getPq1());
            ps.setString(8, info.getPq2());
            ps.setString(9, info.getPq3());

            int i = ps.executeUpdate();
            con.close();
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean updatePass(Info info) {
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("update Info set password=? where user_id=? ");

            ps.setString(2, info.getUser_id());
            ps.setString(1, info.getPassword());


            int i = ps.executeUpdate();
            con.close();
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean updateAccount(Info info) {
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("update Info set fname=?, lname=? ,sex=? , address=?, pq1=? , pq2=? , pq3=? where user_id=? ");
            ps.setString(1, info.getFname());
            ps.setString(2, info.getLname());
            ps.setString(3, info.getSex());
            ps.setString(4, info.getAddress());
            ps.setString(5, info.getPq1());
            ps.setString(6, info.getPq2());
            ps.setString(7, info.getPq3());
            ps.setString(8, info.getUser_id());



            int i = ps.executeUpdate();
            con.close();
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean check_user(Info info) {
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Info where user_id=?");
            ps.setString(1, info.getUser_id());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean check_forgotpass(Info info) {
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Info where user_id=? and pq1=? and pq2=? and pq3=?");
            ps.setString(1, info.getUser_id());
            ps.setString(2, info.getPq1());
            ps.setString(3, info.getPq2());
            ps.setString(4, info.getPq3());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {


                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }

    public static boolean check_user_pass(Info info) {
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Info where user_id=? and password=?");
            ps.setString(1, info.getUser_id());
            ps.setString(2, info.getPassword());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();

            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserCrud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}