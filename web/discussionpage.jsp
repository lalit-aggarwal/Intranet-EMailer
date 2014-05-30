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
<%@ page import = "java.io.*" %>
    </head>
    <body>
        <div>
            
   
            <%Connection con = Model.ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("select * from discussion order by ddate");
        String user_id= session.getAttribute("user_id").toString();
      
        



	ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String user_id1=rs.getString(1);
                 
 Blob image = null;
byte[] imgData = null;

        try{
        PreparedStatement ps1 = con.prepareStatement("select pic from ProfilePic where user_id=?");
       
      
        ps1.setString(1,user_id1);



	ResultSet rs1 = ps1.executeQuery();
        if(rs1.next()){
            image = rs1.getBlob(1);
imgData = image.getBytes(1, (int) image.length());
response.setContentType("image/jpeg");


        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\WowMail\\build\\web\\"+rs.getString(1)+".jpg");
        fos.write(imgData);
        fos.close();
            
            
            
        }
               }
        catch(Exception e){
                e.printStackTrace();
              
        }

%>
        <font size="3" color=#800000><b>
       <img height="30" width="30"  src="<%=rs.getString(1)%>.jpg"></img> <%=rs.getString(1)%>:<br>(<%= rs.getString(2) %>)
        </b></font>
        <br>
        <%=rs.getString(3)%>
        <br>
        <br>
        <hr>
                
        
        <% 
        }
        }
        catch(Exception e){
                e.printStackTrace();
              
        }%>
        <form action="DiscussionPageController" >     
            <input type="text" name="content">
            <input class='button' type="submit" name="mpage" value="post">
        </form>
        </div>
        
    </body>
</html>
