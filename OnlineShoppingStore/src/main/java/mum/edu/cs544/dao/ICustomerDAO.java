package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.cs544.models.Customer;

public interface ICustomerDAO extends JpaRepository<Customer,Long>{

}
