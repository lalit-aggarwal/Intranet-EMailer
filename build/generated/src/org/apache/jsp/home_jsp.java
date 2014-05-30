package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html><head></head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div id=\"IMAGE\" style=\"float:left;\">\n");
      out.write("            <p><img src=\"img.jpg\" height=\"300\" width=\"300\" ></p></div>\n");
      out.write("\n");
      out.write("        <div id=\"hi\" style=\"width:800px;float:left\"><h1>HI<br>\n");
      out.write("                ");
      out.print(session.getAttribute("user_id").toString());
      out.write("</h1>\n");
      out.write("        ");
Connection con = Model.ConnectionManager.getConnection();
        try{
        PreparedStatement ps = con.prepareStatement("select * from info where user_id=?");
        String user_id= session.getAttribute("user_id").toString();
      
        ps.setString(1,user_id);



	ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
      out.write("\n");
      out.write("        NAME:");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("         ");
      out.print(rs.getString(2));
      out.write("<br>\n");
      out.write("         SEX: ");
      out.print(rs.getString(5));
      out.write("<br>\n");
      out.write("          ADDRESS: ");
      out.print(rs.getString(6));
      out.write("<br>\n");
      out.write("          \n");
      out.write("           \n");
      out.write("           \n");
      out.write("        ");
 }
        }
        catch(Exception e){
                e.printStackTrace();
              
        }
      out.write("\n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
