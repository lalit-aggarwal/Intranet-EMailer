


<!DOCTYPE html>
<html>
<head>
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



    

<div id="FORM" >


   
   
       <%
        Model.Draft draft=new Model.Draft();
        Model.Ddelete ddelete=new Model.Ddelete();
        Model.Inbox inbox=new Model.Inbox();
        Model.Outbox outbox=new Model.Outbox();
             String id= request.getParameter("id");
             String type = request.getParameter("name");
             String content=null;
             if(type.equals("draft")){
             draft.setId(id);
             
             content=Model.DraftCrud.select(draft);
                         }
                         else if(type.equals("ddelete")){
             ddelete.setId(id);
             
             content=Model.DdeleteCrud.select(ddelete);
                         }
             else if(type.equals("inbox")){
             inbox.setId(id);
             
              content=Model.Inboxcrud.select(inbox);
                         }
             else if(type.equals("outbox")){
             outbox.setId(id);
             
              content=Model.OutboxCrud.select(outbox);
                         }
             else if(type.equals("album")){
                 
             Connection con = Model.ConnectionManager.getConnection();
     
 Blob image = null;
byte[] imgData = null;

        try{
        PreparedStatement ps = con.prepareStatement("select photo from album where p_id=?");
        String user_id= session.getAttribute("user_id").toString();
      
        ps.setString(1,id);



	ResultSet rs = ps.executeQuery();
        if(rs.next()){
            image = rs.getBlob(1);
imgData = image.getBytes(1, (int) image.length());
response.setContentType("image/jpeg");


        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\WowMail\\build\\web\\albumimg.jpg");
        fos.write(imgData);
            fos.close();
            
            
        }
               }
        catch(Exception e){
                e.printStackTrace();
              
        }
                 
             }
             
             
                         
          
          if(!(type.equals("album")))  { 
        %>
        <form action="DeleteForwardController?a=<%=id%>&b=<%=type%>" method="Post">
    <input class='button' type="submit" name="mpage" value="Forward" >
    <input class='button' type="submit" name="mpage" value="Delete" >
    <textarea rows="40" cols="150" name="content"> 
        <%=content%>

</textarea>  
   
</form>
         <%
          }
                         else {
         %>
         <img height="500" width="500" src="albumimg.jpg"></img>
         <%
                         }
             %>
</div>



</body>
</html>

