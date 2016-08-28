package mum.edu.cs544.services;

import java.util.List;
import java.util.Set;

import mum.edu.cs544.models.Admin;
import mum.edu.cs544.models.Payment;

public interface IPaymentService {
	
	void addPayment(Payment payment);
	
	Set<Payment> getAllPayments();
    
	Payment findById(long id);
    
    void updatePayment(Payment payment);
    
    void remove(long id);

}
