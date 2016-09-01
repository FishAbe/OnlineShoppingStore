/**
 * 
 */
package mum.edu.cs544.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import mum.edu.cs544.models.Order;
import mum.edu.cs544.models.OrderLine;
import mum.edu.cs544.restController.MailSubmissionController;

/**
 * @author Fish
 *
 */
@Aspect
@Component
public class EmailSenderAdvice {
	@Autowired
    JavaMailSender mailSender;
	
	@Autowired
    MailSubmissionController mailController;
	@After("execution(* mum.edu.cs544.services.addOrder(..))&&args(order)")
	 public void sendConfirmationEmail(JoinPoint joinpoint, Order order) throws Throwable {
	        System.out.println("after execution of method " + joinpoint.getSignature().getName());

	        System.out.println("Hello " + order.getOrderDate());
	        long id = order.getId();
	        SimpleMailMessage message = new SimpleMailMessage();
	        System.out.println(message.getReplyTo());

	        StringBuffer sb = new StringBuffer();
	        sb.append("Product Name:  ");
	        sb.append("\t");
	        sb.append("Quantity:  ");
	        sb.append("\t");
	        sb.append("Price:  ");
	        sb.append("\t");
	        sb.append("Expected Delivery Date:  ");
	        for (OrderLine item : order.getOrderLineItems()) {
	            sb.append("\n\n");
	            sb.append(item.getProduct().getName());
	            sb.append("\t");

	            sb.append(item.getQuantity());
	            sb.append("\t");

	            sb.append(item.getProduct().getPrice());
	            sb.append("\t");

	            sb.append(item.getDeliveryDate());
	            sb.append("\n");
	        }
	        message.setText("Thankyou for shopping   " + "\n\n" +
	                "Your Order Details are  : \n" + sb + "\n\n" +
	                "Total Order Price :  " + order.getTotalOrderPrice());
	        message = mailController.send(message);

	        System.out.println(" Email sent successfully " + message);

	    }

}
