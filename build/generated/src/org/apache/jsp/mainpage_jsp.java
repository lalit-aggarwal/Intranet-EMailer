package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        boolean status;
        
        if(session.getId()==null)
                       {
        status=true;
               }
               else {
                   status=false;
                                     }
                  if (!status){
      out.write("\n");
      out.write("        <div id=\"header\" style=\"width:85%;float:right;\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("      \n");
      out.write("        <div id=\"options\" style=\"width:15%;float:left;\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "options.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("         <div id=\"mainbody\" style=\"width:85%;float:right;\">\n");
      out.write("             \n");
      out.write("             ");

             
             
            
             Model.ThemeSet themeset=new Model.ThemeSet();
             String user_id= session.getAttribute("user_id").toString();
             themeset.setUser_id(user_id);
             
             String theme=Model.ThemeCrud.select(themeset);
          
             out.println("<html><body background="+theme+"></body></html>");

String str=request.getParameter("mpage");


if(str!=null){

if(str.equals("   change theme   "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "changetheme.jsp", out, false);
      out.write('\n');
}
else if(str.equals("   Password           "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "changepass.jsp", out, false);
      out.write('\n');
}
else if(str.equals("        Draft              "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "DraftPage.jsp", out, false);
      out.write('\n');
}
else if(str.equals("  Discussion Page ")||str.equals("post"))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "discussionpage.jsp", out, false);
      out.write('\n');
}
else if(str.equals("      Cloud docs      "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cloudpage.jsp", out, false);
      out.write('\n');
}
else if(str.equals("          Album          ")|| str.equals("ADD TO ALBUM"))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "albumpage.jsp", out, false);
      out.write('\n');
}
else if(str.equals("Delete"))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ConfirmDelete.jsp", out, false);
      out.write('\n');
}
else if(str.equals("Send"))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "confirmsend.jsp", out, false);
      out.write('\n');
}
else if(str.equals("Forward"))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Forward.jsp", out, false);
      out.write('\n');
}
else if(str.equals("        Trash            "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "DeletePage.jsp", out, false);
      out.write('\n');
}
else if(str.equals("        Outbox          "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "OutboxPage.jsp", out, false);
      out.write('\n');
}
else if(str.equals("          Inbox           "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "InboxPage.jsp", out, false);
      out.write('\n');
}
else if(str.equals("     profile pic         "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "changePic.jsp", out, false);
      out.write('\n');
}
else if(str.equals("send"))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "confirmsend.jsp", out, false);
      out.write('\n');
}
else if(str.equals("       Compose       ")||str.equals("reset"))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "compose.jsp", out, false);
      out.write('\n');
}
else if(str.equals("   Account info       "))
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "accountinfo.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");

}
else
{
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "home.jsp", out, false);
      out.write('\n');
}


}
else
    {   


      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ShowPage.jsp", out, false);
      out.write('\n');
 }
      out.write("\n");
      out.write("        </div>\n");
      out.write("       <div id=\"foot\" style=\"width:100%;float:left;\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "foot.jsp", out, false);
      out.write("\n");
      out.write("            ");
}
               else{
      out.write("\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("               ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
