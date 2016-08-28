/**
 * 
 */
package mum.edu.cs544.services;

import java.util.List;

import mum.edu.cs544.models.Admin;

/**
 * @author Fish
 *
 */
public interface IAdminService {
	
	void addAdmin(Admin admin);
	
    Admin findById(long id);
    
    void updateAdmin(Admin admin);
    
    List<Admin> getAllAdmins();
    
    void remove(long id);
    
}
    
    
