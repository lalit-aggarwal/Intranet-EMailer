

<html>
    <head>

        <%@ page import="java.sql.*" %>
        <%@ page import = "java.io.*" %>
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
        <div >
            <%Connection con = Model.ConnectionManager.getConnection();

                Blob image = null;
                byte[] imgData = null;

                try {
                    PreparedStatement ps = con.prepareStatement("select pic from ProfilePic where user_id=?");
                    String user_id = session.getAttribute("user_id").toString();

                    ps.setString(1, user_id);



                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        image = rs.getBlob(1);
                        imgData = image.getBytes(1, (int) image.length());
                        response.setContentType("image/jpeg");


                        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\WowMail\\build\\web\\img.jpg");
                        fos.write(imgData);
                        fos.close();


                    }
                } catch (Exception e) {
                    e.printStackTrace();

                }%>
            <img height="150" width="150"  src="img.jpg"></img>
            <form action="mainpage.jsp">
                <br><input type="submit"  name="mpage" class='button' id="theme" value="     profile pic         " ><br>

                <input type="submit"  name="mpage" class='button' id="theme" value="   change theme   " ><br>


                <input type="submit"  name="mpage" class='button' value="       Compose       " ><br>
                <input type="submit"   name="mpage" class='button' value="          Inbox           " ><br>
                <input type="submit"   name="mpage" class='button' value="        Outbox          " ><br>
                <input type="submit"   name='mpage' class='button' value="        Trash            " ><br>
                <input type="submit"   name="mpage" class='button' value="        Draft              " ><br>

                <input type="submit"  name="mpage" class='button' value="   Account info       " ><br>


                <input type="submit"  name="mpage" class='button' value="  Discussion Page " ><br>
                <input type="submit"  name="mpage" class='button' value="      Cloud docs      " ><br>

                <input type="submit"   name="mpage" id="pass" class='button' value="   Password           " ><br>
                <input type="submit"  name="mpage" class='button' value="          Album          " ><br>

            </form>
            <input type="button"  name="mpage" class='button' value="         Logout         "  onclick="window.location='index.jsp'" ><br>

        </div>
    </body>
</html>