
<html>
    <head>

    </head>
    <body>
        <%
            boolean status;

            if (session.getId() == null) {
                status = true;
            } else {
                status = false;
            }
            if (!status) {
        %>
        <div id="header" style="width:85%;float:right;">
            <jsp:include page="head.jsp"/>
        </div>



        <div id="options" style="width:15%;float:left;">
            <jsp:include page="options.jsp"/>
        </div>
        <div id="mainbody" style="width:85%;float:right;">

            <%



                Model.ThemeSet themeset = new Model.ThemeSet();
                String user_id = session.getAttribute("user_id").toString();
                themeset.setUser_id(user_id);

                String theme = Model.ThemeCrud.select(themeset);

                out.println("<html><body background=" + theme + "></body></html>");

                String str = request.getParameter("mpage");


                if (str != null) {

                    if (str.equals("   change theme   ")) {%>
            <jsp:include page="changetheme.jsp"/>
            <%} else if (str.equals("   Password           ")) {%>
            <jsp:include page="changepass.jsp"/>
            <%} else if (str.equals("        Draft              ")) {%>
            <jsp:include page="DraftPage.jsp"/>
            <%} else if (str.equals("  Discussion Page ") || str.equals("post")) {%>
            <jsp:include page="discussionpage.jsp"/>
            <%} else if (str.equals("      Cloud docs      ")) {%>
            <jsp:include page="cloudpage.jsp"/>
            <%} else if (str.equals("          Album          ") || str.equals("ADD TO ALBUM")) {%>
            <jsp:include page="albumpage.jsp"/>
            <%} else if (str.equals("Delete")) {%>
            <jsp:include page="ConfirmDelete.jsp"/>
            <%} else if (str.equals("Send")) {%>
            <jsp:include page="confirmsend.jsp"/>
            <%} else if (str.equals("Forward")) {%>
            <jsp:include page="Forward.jsp"/>
            <%} else if (str.equals("        Trash            ")) {%>
            <jsp:include page="DeletePage.jsp"/>
            <%} else if (str.equals("        Outbox          ")) {%>
            <jsp:include page="OutboxPage.jsp"/>
            <%} else if (str.equals("          Inbox           ")) {%>
            <jsp:include page="InboxPage.jsp"/>
            <%} else if (str.equals("     profile pic         ")) {%>
            <jsp:include page="changePic.jsp"/>
            <%} else if (str.equals("send")) {%>
            <jsp:include page="confirmsend.jsp"/>
            <%} else if (str.equals("       Compose       ") || str.equals("reset")) {%>
            <jsp:include page="compose.jsp"/>
            <%} else if (str.equals("   Account info       ")) {%>
            <jsp:include page="accountinfo.jsp"/>


            <%} else {%>
            <jsp:include page="home.jsp"/>
            <%}


            } else {

            %>
            <jsp:include page="ShowPage.jsp"/>
            <% }%>
        </div>
        <div id="foot" style="width:100%;float:left;">
            <jsp:include page="foot.jsp"/>
            <%} else {%>
            <jsp:include page="index.jsp"/>
            <%}%>
        </div>

    </body>
</html>