import java.util.*;
import javax.mail.Authenticator;  
import javax.mail.Message;  
import javax.mail.MessagingException;  
import javax.mail.PasswordAuthentication;  
import javax.mail.Session;  
import javax.mail.Transport;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  

public class SendEmail
{
	 public SendEmail(){ 
	        String host = "smtp.gmail.com";  
	        int port = 587;  
	        final String username = "emailtest8763@gmail.com";    //�o�e��Email
	        final String password = "passwordis8763";  
	  
	        Properties props = new Properties();  
	        props.put("mail.smtp.host", host);  
	        props.put("mail.smtp.auth", "true");  
	        props.put("mail.smtp.starttls.enable", "true");  
	        props.put("mail.smtp.port", port);  
	          
	        Session session = Session.getInstance(props,new Authenticator(){  
	              protected PasswordAuthentication getPasswordAuthentication() {  
	                  return new PasswordAuthentication(username, password);  
	              }} );  
	           
	        try {  
	  
	        Message message = new MimeMessage(session);  
	        message.setFrom(new InternetAddress("emailtest8763@gmail.com"));  
	        message.setRecipients(Message.RecipientType.TO,   
	                        InternetAddress.parse("fuchienwei8666@gmail.com"));    //������Email
	        message.setSubject("�o�e����");  										//Title
	        message.setText("�P�ǧA�n,\n10������n�W���o!,\n�зǮɨ�ЫǡC");  				//text
	  
	        Transport transport = session.getTransport("smtp");  
	        transport.connect(host, port, username, password);  
	        
	        Transport.send(message);  
	  
	        System.out.println("Done");  
	  
	        } catch (MessagingException e) {  
	            throw new RuntimeException(e);  
	        }  
	    }  
	}