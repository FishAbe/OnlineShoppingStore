/**
 * 
 */
package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.Customer;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Repository
public interface ICustomerDAO extends CrudRepository<Customer,Long> {
    //we don't need an implementation and or method unless we want to do something extra

    @Query("SELECT c FROM Customer c WHERE c.email=:email AND c.password=:password")
    Customer getUserByCredentials(@Param("email") String email, @Param("password") String password);
}
