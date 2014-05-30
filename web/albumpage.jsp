<%-- 
    Document   : albumpage
    Created on : Jan 30, 2013, 8:33:33 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@ page import="java.sql.*" %>
    </head>
    <body>
        <div id="header" style="height:120px;clear:both;text-align:center;">
<P><FONT SIZE="5" COLOR=#800000><U>ALBUM</U></FONT></P></div>
    

<div id="FORM" style="width:700px;float:left;">

<form  enctype="multipart/form-data" action="AlbumController" >
   <table border="0" cellpadding="0" CELLSPACING="0" ALIGN="right">
   
<tr>
     <td><P ><FONT SIZE="3" color=#800000><b>NAME OF PHOTO</b></FONT</td>
     <td><input type="text" name="photo_name"></td>
   </tr>
  
     
   <tr>
     <td><P ><FONT SIZE="3" color=#800000><b>UPLOAD PIC(mention full path)</b></FONT</td>
     <td><input type="text" name="photo"></td>
   </tr>
  





   

<tr><td></td><td><input class='button' type="submit" value="ADD TO ALBUM"  name="mpage">

</table>
</form>
    <form action="AlbumDeleteController">
                <input class='button' type="submit" name="mpage" value="Delete Photograph" >
            <table border="0" cellpadding="0" CELLSPACING="10" ALIGN="left"><br>
                <tr><td><input type="checkbox"   /></td><td><h3>S.no</h3></td><td><h3>Name</h3></td></tr>
   
            <%Connection con = Model.ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("select * from album where user_id=?");
        String user_id= session.getAttribute("user_id").toString();
      
        ps.setString(1,user_id);



	ResultSet rs = ps.executeQuery();
        int i=1;
        while(rs.next()){%>
        
        <tr><td> <input type="checkbox" name="iid" value="<%=rs.getString(1)%>"  /></td><td><%=i%></td><td><a href='mainpage.jsp?id=<%=rs.getString(1)%>&name=album'><%=rs.getString(3)%></a></td></tr>
        
        <% i++;};
        }
        catch(Exception e){
                e.printStackTrace();
              
        }%>
            </table>
            </form>
</div>



    </body>
</html>
