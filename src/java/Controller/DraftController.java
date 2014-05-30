package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DraftController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();
        String user_id = session.getAttribute("user_id").toString();
        String subject = request.getParameter("subject");
        String content= request.getParameter("content");

       Draft draft = new Draft();
        
draft.setUser_id(user_id);
draft.setSubject(subject);
draft.setContent(content);

       boolean status= DraftCrud.insert(draft);
       if(status){
         
           disp.forward(request,response);
       }
       else
       {
           disp1.forward(request,response);

        
    }

}
}
