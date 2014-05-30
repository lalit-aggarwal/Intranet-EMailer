
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ForgotPasswordController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
        
       
        String user_id = request.getParameter("user_id");
        String pq1 = request.getParameter("pq1");
        String pq2 = request.getParameter("pq2");
        String pq3 = request.getParameter("pq3");
        

        Info info= new Info();
        
info.setUser_id(user_id);
info.setPq1(pq1);
info.setPq2(pq2);
info.setPq3(pq3);

       boolean status = UserCrud.check_forgotpass(info);
       if(status){
           String password=request.getParameter("password");
          info.setPassword(password);
          boolean status1=UserCrud.updatePass(info);
          if(status1){
              HttpSession session=request.getSession(); 
          session.setAttribute("user_id",user_id);
          session.setMaxInactiveInterval(3600);
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
