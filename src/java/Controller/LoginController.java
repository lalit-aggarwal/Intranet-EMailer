package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher disp = request.getRequestDispatcher("mainpage.jsp");
        RequestDispatcher disp1 = request.getRequestDispatcher("index1.jsp");
        PrintWriter out = response.getWriter();

        String user_id = request.getParameter("user_id");
        String password = request.getParameter("password");


        Info info = new Info();

        info.setUser_id(user_id);
        info.setPassword(password);

        boolean status1 = UserCrud.check_user_pass(info);
        if (status1) {
            HttpSession session = request.getSession();
            session.setAttribute("user_id", user_id);
            session.setMaxInactiveInterval(3600);
            disp.forward(request, response);
        } else {
            disp1.forward(request, response);
        }

    }
}
