
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AlbumDeleteController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
       
        String id = request.getParameter("iid");
        

       Album album = new Album();
        
album.setP_id(id);

       boolean status= AlbumCrud.delete(album);
       if(status){
         
           disp.forward(request,response);
       }
       else
       {
           disp1.forward(request,response);

        
    }

}
}
