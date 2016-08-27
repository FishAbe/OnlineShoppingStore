package mum.edu.cs544.services;

import java.util.List;

import mum.edu.cs544.models.Payment;

public interface IPaymentService {
	
	void addPayment(Payment payment);
	
    List<Payment> getAllPayments();
    
    

}
