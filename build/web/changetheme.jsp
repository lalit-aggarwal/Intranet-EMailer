


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


<div id="header" style="height:120px;clear:both;text-align:center;">
<P><FONT SIZE="5" COLOR=#800000><U>CHANGE THEME</U></FONT></P></div>


<div id="choice" style="float:left;">
    <form action="ThemeController">
    <h3>choose the theme:</h3>
    <input type="radio" name="theme" value="grey.png" /><img style="border-color:#cc0000;border-style:groove;" src="grey.png" width="150" height="150" alt="logo" >
    
    <input type="radio" name="theme" value="green.jpg" /><img style="border-color:#cc0000;border-style:groove;" src="green.jpg" width="150" height="150" alt="logo" >
    <input type="radio" name="theme" value="purple.jpg" /><img style="border-color:#cc0000;border-style:groove;" src="purple.jpg" width="150" height="150" alt="logo" >
    <input type="radio" name="theme" value="blue.jpg" /><img style="border-color:#cc0000;border-style:groove;" src="blue.jpg" width="150" height="150" alt="logo" >
    <br><input  type="submit" class='button' value="ok" name="mpage" />
    </form>   
</div>



</body>
</html>

