
package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterationController extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher disp=request.getRequestDispatcher("mainpage.jsp");
         RequestDispatcher disp1=request.getRequestDispatcher("registeration1.jsp");
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String user_id = request.getParameter("user_id");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");
        String pq1 = request.getParameter("pq1");
        String pq2 = request.getParameter("pq2");
        String pq3 = request.getParameter("pq3");
        ThemeSet themeset= new ThemeSet();
        Info info= new Info();
        info.setFname(fname);
info.setLname(lname);
info.setUser_id(user_id);
info.setPassword(password);
info.setSex(sex);
info.setAddress(address);
info.setPq1(pq1);
info.setPq2(pq2);
info.setPq3(pq3);
themeset.setUser_id(user_id);
themeset.setTheme("grey.png");
ProfilePic profilepic = new ProfilePic();
profilepic.setUser_id(user_id);
//File file = new File("/emailLogo.jpg");
//FileInputStream pic = new FileInputStream(file);
ServletContext ctx = getServletContext();
InputStream is = ctx.getResourceAsStream("/emailLogo.jpg");

profilepic.setPic(is);


       boolean status1 = UserCrud.check_user(info);
       if(status1){
           disp1.forward(request,response);
       }
       else
       {

        boolean status = UserCrud.insert(info);
        HttpSession session=request.getSession(); 
          session.setAttribute("user_id",user_id);
          session.setMaxInactiveInterval(3600);
        boolean status2 = ThemeCrud.insert(themeset);
        boolean status3= ProfilePicCrud.insert(profilepic);
        if(status3){
            
            
            disp.forward(request, response);
        }
        else {
            response.sendRedirect("error.jsp");
        }
    }

}
}
