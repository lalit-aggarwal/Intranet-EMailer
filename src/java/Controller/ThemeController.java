
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ThemeController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();
        String user_id = session.getAttribute("user_id").toString();
        String theme = request.getParameter("theme");
        

        ThemeSet themeset=new ThemeSet();
        
themeset.setUser_id(user_id);
themeset.setTheme(theme);

       boolean status= ThemeCrud.update(themeset);
       if(status){
         
           disp.forward(request,response);
       }
       else
       {
           disp1.forward(request,response);

        
    }

}
}
