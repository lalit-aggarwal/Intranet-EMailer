
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DeleteForwardController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
         
        PrintWriter out = response.getWriter();
       
        String option = request.getParameter("mpage");
        String id=request.getParameter("a");
        String type = request.getParameter("b");
        if(option.equals("Delete"))
        {
            Draft draft=new Draft();
                    Ddelete ddelete = new Ddelete();
                    Inbox inbox = new Inbox();
                    Outbox outbox = new Outbox();
            boolean status=false;
        
if(type.equals("draft")){
       draft.setId(id);
 status= DraftCrud.delete(draft);
}
if(type.equals("ddelete")){
       ddelete.setId(id);
 status= DdeleteCrud.delete(ddelete);
}
if(type.equals("outbox")){
       outbox.setId(id);
 status= OutboxCrud.delete(outbox);
}
else if(type.equals("inbox")){
       inbox.setId(id);
 status= Inboxcrud.delete(inbox);
}
       if(status){
         
           disp.forward(request,response);
       }
       else
       {
           disp1.forward(request,response);

        
    }
        }
        else if(option.equals("Forward")){
           disp.forward(request,response);
        
        }

}
}
