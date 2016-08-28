/**
 * 
 */
package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mum.edu.cs544.models.Admin;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
public interface AdminDAO extends CrudRepository<Admin,Long> {
    //we don't need an implementation and or method unless we want to do something extra

    @Query("SELECT a FROM Admin a WHERE a.email=:email AND a.password=:password")
    public Admin findAdmin(@Param("email") String email, @Param("password") String password);
}
