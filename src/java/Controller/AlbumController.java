
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AlbumController extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("error.jsp");
        PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();
       
        String user_id = session.getAttribute("user_id").toString();
        String photo_name=request.getParameter("photo_name");
FileInputStream is = new FileInputStream(request.getParameter("photo"));



        Album album= new Album();
        
album.setUser_id(user_id);
album.setPhoto_name(photo_name);
album.setPhoto(is);

       boolean status= AlbumCrud.insert(album);
       if(status){
         
           disp.forward(request,response);
       }
       else
       {
           disp1.forward(request,response);

        
    }

}
}
