/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*; 
/**
 *
 * @author Hasintha
 */
public class sendemail {
    
public  void email(String x,String name) {  
  
  String host="mail.apedeals.lk";  
  final String user="trincomaleelibrarian@apedeals.lk";//change accordingly  
  final String password="H@sintha1996";//change accordingly  
    
  String to=x;//change accordingly  
  
   //Get the session object  
   Properties props = new Properties();  
   props.put("mail.smtp.host",host);  
   props.put("mail.smtp.auth", "true");  
     
   Session session = Session.getDefaultInstance(props,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("Library mangement system");  
     message.setText("Dear student,"+name+" \nThis is to inform about returning books\n"
             + "You have borrowed a book 2 weeks ago.your deadline was expired."
             + "There is only 2 days for you.please handover it quickly.Otherwise you have to pay according to library rules\n"
             + "");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {e.printStackTrace();}  
    }

}
    

