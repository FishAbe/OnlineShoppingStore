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

import mum.edu.cs544.dao.IAdminDAO;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;


import mum.edu.cs544.models.Admin;
import mum.edu.cs544.services.IAdminService;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
@Service
@Transactional
public class AdminService implements IAdminService {
    
	private IAdminDAO _adminDao;
	
	@Autowired
	public AdminService(IAdminDAO adminDao){
		_adminDao = adminDao;
	}
	
	
	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#addAdmin(mum.edu.cs544.models.Admin)
	 */
	@Override
	public void addAdmin(Admin admin) {
		_adminDao.save(admin);
		
	}



	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#findById(long)
	 */
	@Override
	public Admin findById(long id) {
		return _adminDao.findOne(id);

	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#updateAdmin(mum.edu.cs544.models.Admin)
	 */
	@Override
	public void updateAdmin(Admin admin) {
		_adminDao.save(admin);
		
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#getAllAdmins()
	 */
	@Override
	public Set<Admin> getAllAdmins() {
		Set<Admin> result = new HashSet<Admin>();
        _adminDao.findAll().forEach(item -> result.add(item));
        return result;

	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#remove(long)
	 */
	@Override
	public void remove(long id) {
		_adminDao.delete(id);
		
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#checkAdmin(java.lang.String, java.lang.String)
	 */
	@Override
	public Admin checkAdmin(String email, String password) {
		// TODO Auto-generated method stub
		
		return  _adminDao.findAdmin(email,password);
	}
}



	


