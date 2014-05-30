


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
<script language="JavaScript">
    function verify(form){
        
                if(form.elements[0].value.length==0 || form.elements[1].value.length==0){
                    alert('please fill password snd username');
                    return false;
                    
               
    }
    }
    
</script>
    </head>

<body>



<div id="header" style="height:100px;clear:both;text-align:center;background-image:url('red.jpg');">
<P><FONT SIZE="15" COLOR=#ffffff><b>WELCOME TO WOW MAIL!!</b></FONT></P></div>

<div id="IMAGE" style="float:left;">
<p><img src="emailLogo.jpg"  ></p></div>

<div id="FORM" style="width:700px;float:right">
    <font size="3" color=#800000><b>username doesnt match with the password</b></FONT>
    <form action="LoginController" onsubmit="return verify(this);">
    
   <table border="0" cellpadding="10"  ;">
   <tr>
     <td><P ><font size="4" color=#800000><b>USERNAME</b></FONT></td>
     <td><input type="text" name="user_id"></td>
   </tr>
   <tr>
     <td><P ><FONT SIZE="4" color=#800000><b>PASSWORD</b></FONT</td>
     <td><input type="PASSWORD" name="password"></td>
   </tr>
   
<tr><td></td><td><input type="submit" class='button' name="mpage" value="LOGIN" /></td></tr>

<tr><td></td><td><a href="forgotpass.jsp">forgot your password??</a></td></tr>

<tr><td></td><td><p >Don't have an account<input class='button' type="button" value="SIGN UP" onclick="window.location='registeration.jsp'"></td></tr>
</table>
</form></div>

<div id="footer" style="clear:both;text-align:center;background-image:url('red.jpg');"><p><font size="3" color=#ffffff>
Copyright © Wowmail.com</font></p></div>


 
</body>
</html>

