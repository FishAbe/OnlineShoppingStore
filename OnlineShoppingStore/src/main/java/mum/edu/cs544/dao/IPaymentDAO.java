package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.Payment;

@Repository
public interface IPaymentDAO extends JpaRepository<Payment, Long> {

}
