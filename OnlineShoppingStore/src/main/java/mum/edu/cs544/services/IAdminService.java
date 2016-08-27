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
	
    Admin findById(int id);
    
    void updateAdmin(Admin admin);
    
    List<Admin> getAllAdmins();
    
    void remove(Admin admin);
    
}
    
    
