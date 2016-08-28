/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IAdminDAO;
import mum.edu.cs544.models.Admin;
import mum.edu.cs544.services.IAdminService;

/**
 * @author Fish
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
@Component
public class AdminService implements IAdminService {
    
	private IAdminDAO _adminDao;
	
	@Autowired
	public AdminService(IAdminDAO adminDao){
		_adminDao = adminDao;
	}
	
	
	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#addAdmin(mum.edu.cs544.models.Admin)
	 */
	public void addAdmin(Admin admin) {

         _adminDao.save(admin);
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#findById(int)
	 */
	public Admin findById(long id) {
		return _adminDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#updateAdmin(mum.edu.cs544.models.Admin)
	 */
	public void updateAdmin(Admin admin) {
		_adminDao.save(admin);
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#getAllAdmins()
	 */
	public List<Admin> getAllAdmins() {
		return _adminDao.findAll();
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#remove(mum.edu.cs544.models.Admin)
	 */
	public void remove(long id) {
		_adminDao.delete(id);

	}

}
