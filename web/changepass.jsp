


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
        if(form.elements[1].value!=form.elements[2].value){
            alert('New Password and confirm password doesnt match');
            return false;
        }
        
            else{
                
            if(form.elements[1].value.length < 5) 
                {
          alert('Please enter a password that is at least 5 characters long');
          return false;
      }
            else{
                alert('You have Successfully entered data');
                return true;
            }
            
        
    }
}
    
</script>
    </head>

<body>


<div id="header" style="height:120px;clear:both;text-align:center;">
<P><FONT SIZE="5" COLOR=#800000><U>CHANGE PASSWORD</U></FONT></P></div>
    

<div id="FORM" style="width:700px;float:left;">

<form action="PasswordController" onsubmit="return verify(this);">
   <table border="0" cellpadding="0" CELLSPACING="0" ALIGN="right">
   

     
   <tr>
     <td><P ><FONT SIZE="3" color=#800000><b>OLD PASSWORD</b></FONT</td>
     <td><input type="PASSWORD" name="password"></td>
   </tr>
  


<tr>
     <td><P ><FONT SIZE="3" color=#800000><b>NEW PASSWORD</b></FONT</td>
     <td><input type="PASSWORD" name="npassword"></td>
   </tr>
   <tr>
     <td><P ><FONT SIZE="3" color=#800000><b>CONFIRM PASSWORD</b></FONT</td>
     <td><input type="PASSWORD" name="cpassword"></td>
   </tr>


   

<tr><td></td><td><input class='button' type="submit" value="OK"  name="mpage">

</table>
</form></div>



</body>
</html>

