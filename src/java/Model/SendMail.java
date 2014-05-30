package Model;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {
 public static boolean send(String pass, String from, String to, String subject, String content) {
     
final String pass1=pass;
final  String from1= from;
final String to1=to;
final String subject1=subject;
final String content1=content;


 //change accordingly

//Get the session object
  Properties props = new Properties();
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.socketFactory.port", "465");
  props.put("mail.smtp.socketFactory.class",
        	"javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "465");
 
  Session session = Session.getInstance(props,
   new javax.mail.Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {
   return new PasswordAuthentication(from1,pass1);//change accordingly
   }
  });
 
//compose message
  try {
   MimeMessage message = new MimeMessage(session);
   message.setFrom(new InternetAddress(from1));//change accordingly
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to1));
   message.setSubject(subject1);
   message.setText(content1);
   
   //send message
   Transport.send(message);
            
   return true;
 
  } catch (Exception e) {return false;}
 
 }
 
}