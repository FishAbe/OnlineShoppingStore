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

import mum.edu.cs544.dao.AdminDAO;
import mum.edu.cs544.models.Admin;
import mum.edu.cs544.services.IAdminService;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
@Service
@Transactional
public class AdminService implements IAdminService {

    @Autowired
    private AdminDAO adminDao;

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#addAdmin(mum.edu.cs544.models.Admin)
	 */
    @Override
	public void addAdmin(Admin admin) {
		adminDao.save(admin);
       // return adminDao.findOne((long) admin.getId());
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#findById(int)
	 */
	@Override
	public Admin findById(long id) {
		return adminDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#updateAdmin(mum.edu.cs544.models.Admin)
	 */
	@Override
	public void updateAdmin(Admin admin) {
		 adminDao.save(admin);
		
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#getAllAdmins()
	 */
	@Override
	public Set<Admin> getAllAdmins() {
		Set<Admin> result = new HashSet<Admin>();
        adminDao.findAll().forEach(item -> result.add(item));
        return result;
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAdminService#remove(mum.edu.cs544.models.Admin)
	 */
	@Override
	public void remove(Admin admin) {
		adminDao.delete(admin);
	}

	@Override
	 public Admin checkAdmin(String email, String password) {
	        return adminDao.findAdmin(email,password);
	    }

}
