<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.*"%>

<%@ page import="java.io.*"%>
<%@ page import="java.util.Properties"%>
<%@ page import="javax.mail.*"%>
<%@ page import="sun.net.smtp.SmtpClient"%>
<%@ page import="javax.mail.internet.*"%>
<%@ page import="javax.servlet.*"%>
 <%@ page import="javax.activation.*"%>
<%@ page import="javax.servlet.http.*"%> 
 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>send mail</title>
    </head>
    <body>
 
   <%
		String to=request.getParameter("to");
		
		String password=null;
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");   
   try
    {
   
    
        SmtpClient client = new SmtpClient("smtp.gmail.com");
     String from="preeti.15.raheja@gmail.com";
     password="divijsaksham";
   
   
   
     
     Properties props =System.getProperties();
             props.setProperty("mail.smtp.host", "smtp.gmail.com");
	                 props.setProperty("mail.smtp.port", "25");
	                 props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");
        Session sessio = Session.getDefaultInstance(props, null);
        
         Message message = new MimeMessage(sessio);
	            message.setFrom(new InternetAddress(from));
	            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
	            message.setSubject(subject);
	            message.setText(content);
	 
	            //
	            // Send the message to the recipient.
	            //
            Transport transport = sessio.getTransport("smtp");
	    transport.connect("smtp.gmail.com", 25, from, password);
	    transport.sendMessage(message, message.getAllRecipients());
     client.from(from);
     client.to(to);
     PrintStream messag = client.startMessage();
     messag.println("To: " + to);
     messag.println("Subject:  "+subject);
     messag.println();
     messag.println(content);
     client.closeServer();
     
     response.sendRedirect("confirmsend.jsp");
     
      }
  catch (Exception e)
  {
      out.println(e);
    //response.sendRedirect("error.jsp");
  }
     %>

    </body>
</html>