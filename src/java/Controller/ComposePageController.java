package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ComposePageController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       try{
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
        RequestDispatcher disp1=request.getRequestDispatcher("Email");
         RequestDispatcher disp2=request.getRequestDispatcher("DraftController");
        
        
        PrintWriter out = response.getWriter();
        String option = request.getParameter("mpage");
        if(option.equals("send")){
            disp1.forward(request, response);
        }
        else if(option.equalsIgnoreCase("reset"))
            disp.forward(request, response);
        else if(option.equalsIgnoreCase("save as draft"))
            disp2.forward(request, response);
       }catch(Exception e){e.printStackTrace();}
    }
}