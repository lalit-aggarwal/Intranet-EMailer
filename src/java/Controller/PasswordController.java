
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PasswordController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
        
       HttpSession session=request.getSession();
        String user_id = session.getAttribute("user_id").toString();
        String password = request.getParameter("password");
        

        Info info= new Info();
        
info.setUser_id(user_id);
info.setPassword(password);

       boolean status = UserCrud.check_user_pass(info);
       if(status){
          password=request.getParameter("npassword");
          info.setPassword(password);
          boolean status1=UserCrud.updatePass(info);
          if(status1){
              disp.forward(request, response);
          }
          else{
              disp1.forward(request, response);
          }
       }
       else
       {
           disp1.forward(request,response);

        
    }

}
}
