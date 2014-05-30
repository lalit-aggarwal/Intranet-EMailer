
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ProfilePicController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();
       
        String user_id = session.getAttribute("user_id").toString();
FileInputStream is = new FileInputStream(request.getParameter("pic"));



        ProfilePic profilepic=new ProfilePic();
        
profilepic.setUser_id(user_id);
profilepic.setPic(is);

       boolean status= ProfilePicCrud.update(profilepic);
       if(status){
         
           disp.forward(request,response);
       }
       else
       {
           disp1.forward(request,response);

        
    }

}
}
