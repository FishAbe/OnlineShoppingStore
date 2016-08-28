/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;


import mum.edu.cs544.dao.ILaptopDAO;
import mum.edu.cs544.models.Laptop;
import mum.edu.cs544.models.Product;
import mum.edu.cs544.services.ILaptopService;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
public class LaptopService implements ILaptopService {

    @Autowired
    private ILaptopDAO laptopDao;
  //  @Autowired private CategoryDao categoryDao;

    
    /* (non-Javadoc)
     * @see mum.edu.cs544.services.ILaptopService#add(mum.edu.cs544.models.Laptop)
     */
    @Override
    public void add(Laptop laptop) {
    	// TODO Auto-generated method stub
    	laptopDao.save(laptop);
    }

    /* (non-Javadoc)
     * @see mum.edu.cs544.services.ILaptopService#update(mum.edu.cs544.models.Laptop)
     */
    @Override
    public void update(Laptop laptop) {
    	// TODO Auto-generated method stub
    	laptopDao.save(laptop);
    	
    }
 
    @Override
    public void delete(long id) {
        laptopDao.delete(id);
    }

    @Override
    public Laptop findById(long id) {
        return laptopDao.findOne(id);
    }

    @Override
    public Set<Laptop> getAll() {
        Set<Laptop> result = new HashSet<>();
        laptopDao.findAll().forEach(item -> result.add(item));
        return result;
    }

    @Override
    public int getProductCopies(Product p) {
        return laptopDao.getProductCopies(p);
    }



/* (non-Javadoc)
 * @see mum.edu.cs544.services.ILaptopService#getLastest6Laptops()
 */
@Override
public Set<Laptop> getLastest6Laptops() {
	// TODO Auto-generated method stub
	 return laptopDao.findFirst6ByOrderByIdDesc();
}

/* (non-Javadoc)
 * @see mum.edu.cs544.services.ILaptopService#get2SpecialDiscountedLaptop()
 */
@Override
public Set<Laptop> get2SpecialDiscountedLaptop() {
	// TODO Auto-generated method stub
	 return laptopDao.findFirst2ByOrderByDiscountDesc();
}

/* (non-Javadoc)
 * @see mum.edu.cs544.services.ILaptopService#getLaptopByCategory(long)
 */
@Override
public Set<Laptop> getLaptopByCategory(long categoryId) {
	// TODO Auto-generated method stub
	return null;
}

}