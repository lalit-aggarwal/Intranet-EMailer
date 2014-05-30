<%-- 
    Document   : home
    Created on : Oct 14, 2012, 10:24:11 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><%@ page import="java.sql.*" %></head>
    
    <body>
        <div id="IMAGE" style="float:left;">
            <p><img src="img.jpg" height="300" width="300" ></p></div>

        <div id="hi" style="width:800px;float:left"><h1>HI<br>
                <%=session.getAttribute("user_id").toString()%></h1>
        <%Connection con = Model.ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("select * from info where user_id=?");
        String user_id= session.getAttribute("user_id").toString();
      
        ps.setString(1,user_id);



	ResultSet rs = ps.executeQuery();
        
        if(rs.next()){%>
        NAME:<%=rs.getString(1)%>
         <%=rs.getString(2)%><br>
         SEX: <%=rs.getString(5)%><br>
          ADDRESS: <%=rs.getString(6)%><br>
          
           
           
        <% }
        }
        catch(Exception e){
                e.printStackTrace();
              
        }%>
        </div>
             
    </body>
</html>
