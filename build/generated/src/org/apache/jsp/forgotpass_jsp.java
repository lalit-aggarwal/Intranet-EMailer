package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <style>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t.button {\n");
      out.write("\t\t\n");
      out.write("\t\tdisplay: inline;\n");
      out.write("\t\t\n");
      out.write("\t\tborder: 2px solid #eee;\n");
      out.write("                background-color: #800000;\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\t\n");
      out.write("\t\tborder-radius: 10px;\n");
      out.write("\t\t-moz-border-radius: 5px;\n");
      out.write("\t\t-webkit-border-radius: 5px;\n");
      out.write("\t\ttext-shadow: 1px 1px #666;\n");
      out.write("                font-size: 100%; padding: 8px 12px;\n");
      out.write("\t\t}\n");
      out.write("\t.button:hover {\n");
      out.write("\t\tbackground-position: 0 center;\n");
      out.write("                border-radius: 50px;\n");
      out.write("\t\t}\n");
      out.write("\t.button:active {\n");
      out.write("\t\tbackground-position: 0 top;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\ttop: 1px;\n");
      out.write("\t\tpadding: 8px 12px 6px;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("</style>\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("    function verify(form){\n");
      out.write("        if(form.elements[4].value!=form.elements[5].value){\n");
      out.write("            alert('New Password and confirm password doesnt match');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("            else{\n");
      out.write("                \n");
      out.write("            if(form.elements[4].value.length < 5) \n");
      out.write("                {\n");
      out.write("          alert('Please enter a password that is at least 5 characters long');\n");
      out.write("          return false;\n");
      out.write("      }\n");
      out.write("            else{\n");
      out.write("                alert('You have Successfully entered data');\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"header\" style=\"height:120px;clear:both;text-align:center;background-image:url('red.jpg');\">\n");
      out.write("<P><FONT SIZE=\"15\" COLOR=#ffffff><b>WELCOME TO WOW MAIL!!</b><BR><FONT SIZE=\"5\" COLOR=#ffffff><U>FORGOT YOUR PASSWORD??</U></FONT></FONT></P></div>\n");
      out.write("<div id=\"IMAGE\" style=\"float:left;\">\n");
      out.write("<p><img src=\"emailLogo.jpg\"  ></p></div>\n");
      out.write("\n");
      out.write("<div id=\"FORM\" style=\"width:700px;float:right;\">\n");
      out.write("    <font size=\"2\" color=#800000><b>If your security questions doesnt match, error page will be displayed</b></FONT>\n");
      out.write("<form action=\"ForgotPasswordController\" onsubmit=\"return verify(this);\" >\n");
      out.write("   <table border=\"0\" cellpadding=\"0\" CELLSPACING=\"0\" ALIGN=\"left\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("     <TR><td><P ><font size=\"3\" color=#800000><b>USER_ID</b></FONT></td>\n");
      out.write("     <td><input type=\"text\" name=\"user_id\"></td>\n");
      out.write("   </tr>\n");
      out.write("   \n");
      out.write("     <TR><td><P ><font size=\"3\" color=#800000><b>QUESTIONS FOR PASSWORD SECURITY:</b></FONT></td>\n");
      out.write("     <td></td>\n");
      out.write("   </tr>\n");
      out.write("<tr>\n");
      out.write("     <td><P ><font size=\"3\" color=#800000><b>YOUR FIRST PHONE NO.??</b></FONT></td>\n");
      out.write("     <td><input type=\"text\" name=\"pq1\"></td>\n");
      out.write("   </tr>\n");
      out.write("<tr>\n");
      out.write("     <td><P ><font size=\"3\" color=#800000><b>YOUR FAVOURITE DESTINATION??</b></FONT></td>\n");
      out.write("     <td><input type=\"text\" name=\"pq2\"></td>\n");
      out.write("   </tr>\n");
      out.write("<tr>\n");
      out.write("     <td><P ><font size=\"3\" color=#800000><b>YOUR FAVOURITE FOOD??</b></FONT></td>\n");
      out.write("     <td><input type=\"text\" name=\"pq3\"></td>\n");
      out.write("<tr>\n");
      out.write("     <td><P ><FONT SIZE=\"3\" color=#800000><b>NEW PASSWORD</b></FONT</td>\n");
      out.write("     <td><input type=\"PASSWORD\" name=\"password\"></td>\n");
      out.write("   </tr>\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("     <td><P ><FONT SIZE=\"3\" color=#800000><b>CONFIRM PASSWORD</b></FONT</td>\n");
      out.write("     <td><input type=\"PASSWORD\" name=\"cpassword\"></td>\n");
      out.write("   </tr>\n");
      out.write("<tr>\n");
      out.write("   </tr>\n");
      out.write("\n");
      out.write("<tr><td></td><td><input class='button' type=\"submit\" value=\"OK\"  name=\"mpage\" >\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</form></div>\n");
      out.write("\n");
      out.write("<div id=\"footer\" style=\"clear:both;text-align:center;background-image:url('red.jpg');\"><p><font size=\"3\" color=#ffffff>\n");
      out.write("Copyright © Wowmail.com</font></p></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
