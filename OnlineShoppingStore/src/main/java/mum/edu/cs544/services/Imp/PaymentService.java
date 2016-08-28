/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IPaymentDAO;
import mum.edu.cs544.models.Order;
import mum.edu.cs544.models.Payment;
import mum.edu.cs544.services.IPaymentService;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Service
@Transactional
public class PaymentService implements IPaymentService {
	
	@Autowired
	IPaymentDAO paymentDao;

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IPaymentService#addPayment(mum.edu.cs544.models.Payment)
	 */
	@Override
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.save(payment);
		
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IPaymentService#getAllPayments()
	 */
	@Override
	public Set<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		Set<Payment> result = new HashSet<>();
		paymentDao.findAll().forEach(item -> result.add(item));
        return result;
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IPaymentService#findById(long)
	 */
	@Override
	public Payment findById(long id) {
		// TODO Auto-generated method stub
		return paymentDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IPaymentService#updatePayment(mum.edu.cs544.models.Payment)
	 */
	@Override
	public void updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.save(payment);
		
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IPaymentService#remove(long)
	 */
	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		paymentDao.delete(id);
	}

}
