
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DraftDeleteController extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
       
        String id = request.getParameter("iid");
        

       Draft draft=new Draft();
        
draft.setId(id);

       boolean status= DraftCrud.delete(draft);
       if(status){
         
           disp.forward(request,response);
       }
       else
       {
           disp1.forward(request,response);

        
    }

}
}
