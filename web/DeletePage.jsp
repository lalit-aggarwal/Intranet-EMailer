<%-- 
    Document   : DraftPage
    Created on : Nov 16, 2012, 11:09:33 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
	
	
	.button {
		
		display: inline;
		
		border: 2px solid #eee;
                background-color: #800000;
		
		
		color: #fff;
		cursor: pointer;
		
		border-radius: 10px;
		-moz-border-radius: 5px;
		-webkit-border-radius: 5px;
		text-shadow: 1px 1px #666;
                font-size: 100%; padding: 8px 12px;
		}
	.button:hover {
		background-position: 0 center;
                border-radius: 50px;
		}
	.button:active {
		background-position: 0 top;
		position: relative;
		top: 1px;
		padding: 8px 12px 6px;
		}
	
</style>

<%@ page import="java.sql.*" %>
    </head>
    <body>
        <div>
            <form action="DdeleteDeleteController">
                <input class='button' type="submit" name="mpage" value="Delete" >
            <table border="0" cellpadding="0" CELLSPACING="10" ALIGN="left"><br>
                <tr><td><input type="checkbox"   /></td><td><h3>S.no</h3></td><td><h3>Subject</h3></td><td><h3>Date</h3></td></tr>
   
            <%Connection con = Model.ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("select * from Ddelete where user_id=?");
        String user_id= session.getAttribute("user_id").toString();
      
        ps.setString(1,user_id);



	ResultSet rs = ps.executeQuery();
        int i=1;
        while(rs.next()){%>
        
        <tr><td> <input type="checkbox" name="iid" value="<%=rs.getString(1)%>"  /></td><td><%=i%></td><td><a href='mainpage.jsp?id=<%=rs.getString(1)%>&name=ddelete'><%= rs.getString(2) %></a> </td><td><%=rs.getDate(4)%></td></tr>
        
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
