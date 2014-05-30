


<!DOCTYPE html>
<html><head>
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
        if(form.elements[3].value!=form.elements[4].value){
            alert('Password and confirm password doesnt match');
            return false;
        }
        else{
            if (form.elements[3].value.length < 5) {
          alert('Please enter a password that is at least 5 characters long');
          return false;
            }
            else{
                if(form.elements[0].value.length==0 || form.elements[1].value.length==0 ||form.elements[2].value.length==0 || form.elements[3].value.lenght==0 || form.elements[4].value.lenght==0 ){
                    alert('mandatory columns are not filled');
                    return false;
                    
                }
            
            else{
                alert('You have Successfully entered data');
                return true;
            }
            }
        }
    }
    
</script>
    </head>

<body>



<div id="header" style="WIDTH:1500PX;HEIGHT:120px;clear:both;text-align:center;background-image:url('red.jpg')">
<P><FONT SIZE="15" COLOR=#ffffff><b>WELCOME TO WOW MAIL!!</b><BR><FONT SIZE="5" COLOR=#ffffff><U>REGISTERATION FORM</U></FONT></FONT></P></div>

<div id="IMAGE" style="float:left;">
<p><img src="emailLogo.jpg"  ></p></div>

<div id="FORM" style="width:700px;float:right">
    <font size="3" color=#800000><b>options marked with * are mandatory to fill</b></FONT>
    <form action="RegisterationController" onsubmit="return verify(this);" >
   <table border="0" cellpadding="0" CELLSPACING="0" ALIGN="left">
   
   <TR><td><P ><font size="3" color=#800000><b>*FIRSTTNAME</b></FONT></td> <td><input type="text" name="fname"></td>
   </tr>
<tr>
     <td><P ><font size="3" color=#800000><b>*LASTTNAME</b></FONT></td>
     <td><input type="text" name="lname"></td>
   </tr>
<tr>
     <td><P ><font size="3" color=#8000000><b>*USER_ID</b></FONT></td>
     <td><input type="text" name="user_id"></td>
   </tr>
   <tr>
     <td><P ><FONT SIZE="3" color=#800000><b>*PASSWORD</b></FONT</td>
     <td><input type="PASSWORD" name="password"></td>
   </tr>
   <tr>
     <td><P ><FONT SIZE="3" color=#800000><b>*CONFIRM PASSWORD</b></FONT</td>
     <td><input type="PASSWORD" name="cpassword"></td>
   </tr>

<tr>
     <td><P ><font size="3" color=#800000><b>*SEX</b></FONT></td>
<TD><FONT SIZE="3" COLOR=#800000><input type="radio" name="sex" value="Male" />Male 
<input type="radio" name="sex" value="Female" />Female</FONT></TD></TR>
<tr>
    <tr>
     <td><P ><font size="3" color=#8000000><b>ADDRESS</b></FONT></td>
     <td><input type="text" name="address"></td>
   </tr>
     
     <td><P ><font size="3" color=#800000><b>QUESTIONS FOR PASSWORD SECURITY:</b></FONT></td>
     <td></td>
   </tr>
<tr>
     <td><P ><font size="3" color=#800000><b>*YOUR FIRST PHONE NO.??</b></FONT></td>
     <td><input type="text" name="pq1"></td>
   </tr>
<tr>
     <td><P ><font size="3" color=#800000><b>*YOUR FAVOURITE DESTINATION??</b></FONT></td>
     <td><input type="text" name="pq2"></td>
   </tr>
<tr>
     <td><P ><font size="3" color=#800000><b>*YOUR FAVOURITE FOOD??</b></FONT></td>
     <td><input type="text" name="pq3"></td>
   </tr>

<tr><td></td><td><input  type="submit" class='button' value="submit" name="mpage" /></td></tr>


</table>
</form></div>

<div id="footer" style="clear:both;text-align:center;background-image:url('red.jpg')"><p><font size="3" color=#ffffff>
Copyright © Wowmail.com</font></p></div>

</body>
</html>

