package Controller;

import Model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Email extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       try{
        RequestDispatcher disp=request.getRequestDispatcher("error.jsp");
        RequestDispatcher disp1=request.getRequestDispatcher("mainpage.jsp");
        String pass=request.getParameter("pass");
        String from=request.getParameter("from");
         String to=request.getParameter("to");
            String subject=request.getParameter("subject");
            String content=request.getParameter("content");
            HttpSession session=request.getSession();
        String user_id = session.getAttribute("user_id").toString();
        String sendto = request.getParameter("sendto");
        if(sendto.equals("others"))
        {
        SendMail sm = new SendMail();
        boolean status=sm.send(pass,from,to,subject,content);
        if(status){
           
            Outbox outbox = new Outbox();
            outbox.setFfrom(from);
            outbox.setContent(content);
            outbox.setSubject(subject);
            outbox.setTto(to);
            outbox.setUser_id(user_id);
            boolean status1=OutboxCrud.insert(outbox);
            disp1.forward(request, response);
        }
        else
            disp.forward(request, response);
        }
        else
        {
            Outbox outbox = new Outbox();
            outbox.setFfrom(user_id+"@wowmail.com");
            outbox.setContent(content);
            outbox.setSubject(subject);
            outbox.setTto(to);
            outbox.setUser_id(user_id);
            boolean status1=OutboxCrud.insert(outbox);
            Inbox inbox = new Inbox();
            inbox.setFfrom(user_id+"@wowmail.com");
            inbox.setContent(content);
            inbox.setSubject(subject);
            inbox.setUser_id(to);
            boolean status2=Inboxcrud.insert(inbox);
            disp1.forward(request, response);
        }
        
        PrintWriter out = response.getWriter();
        
       }catch(Exception e){e.printStackTrace();}
    }
}