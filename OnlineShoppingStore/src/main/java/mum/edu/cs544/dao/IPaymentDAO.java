package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.cs544.models.Payment;

public interface IPaymentDAO extends JpaRepository<Payment, Long> {

}
