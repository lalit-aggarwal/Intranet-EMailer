
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AccountController extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("registeration1.jsp");
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
       
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");
        String pq1 = request.getParameter("pq1");
        String pq2 = request.getParameter("pq2");
        String pq3 = request.getParameter("pq3");
        HttpSession session=request.getSession();
        String user_id = session.getAttribute("user_id").toString();
        Info info= new Info();
        info.setFname(fname);
info.setLname(lname);
info.setUser_id(user_id);
info.setSex(sex);
info.setAddress(address);
info.setPq1(pq1);
info.setPq2(pq2);
info.setPq3(pq3);

      

        boolean status = UserCrud.updateAccount(info);
       
        
        if(status){
            
            
            disp.forward(request, response);
        }
        else {
            response.sendRedirect("error.jsp");
        }
    
}
}
