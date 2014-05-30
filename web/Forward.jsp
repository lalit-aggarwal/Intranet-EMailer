


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
    </head>

<body>



    

<div id="FORM" >

<form action="ComposePageController">
    <input class='button' type="submit" name="mpage" value="send" >
    <input class='button' type="submit" name="mpage" value="reset" >
    <input class='button' type="submit" name="mpage" value="save as draft" >
   <table border="0" cellpadding="0" CELLSPACING="0" ALIGN="left"><br>
   
<tr>
     <td><P ><FONT SIZE="3" color=#800000><b>FROM(gmail id)</b></FONT</td>
     <td><textarea rows="2"  cols="150" name="from"></textarea></td>
   </tr>
   <tr>
     <td><P ><FONT SIZE="3" color=#800000><b>PASSWORD(gmail)</b></FONT</td>
     <td><input type="password" name="pass"</td>
   </tr>
     
   <tr>
     <td><P ><FONT SIZE="3" color=#800000><b>TO</b></FONT</td>
     <td><textarea rows="2"  cols="150" name="to"></textarea></td>
   </tr>
  
<tr>
     <td><P ><FONT SIZE="3" color=#800000><b>SUBJECT</b></FONT</td>
     <td><textarea rows="2" cols="150" name="subject"></textarea></td>
   </tr>
  
<%
String content=request.getParameter("content");%>
<tr>
     <td><P ><FONT SIZE="3" color=#800000><b></b></FONT</td>
     <td><textarea rows="40" cols="150" name="content"><%=content%></textarea></td>
   </tr>
  
   

   



</table>
</form></div>



</body>
</html>

