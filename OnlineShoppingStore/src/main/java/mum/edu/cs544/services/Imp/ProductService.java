/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IProductDAO;
import mum.edu.cs544.models.Product;
import mum.edu.cs544.services.IProductService;

/**
 * @author Fish
 *
 */
@Service
@Transactional
public class ProductService implements IProductService {
    
	
	private IProductDAO _productDao;
	 
	@Autowired
	 public ProductService(IProductDAO productDAO) {
		_productDao = productDAO;
	}
	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IProductService#findById(long)
	 */
	@Override
	public Product findById(long id) {
		return _productDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IProductService#updateProduct(mum.edu.cs544.models.Product)
	 */
	@Override
	public void updateProduct(Product product) {
		_productDao.save(product);

	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IProductService#getAllProducts()
	 */
	@Override
	public Set<Product> getAllProducts() {
		Set<Product> result = new HashSet<Product>();
        _productDao.findAll().forEach(item -> result.add(item));
        return result;
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IProductService#remove(long)
	 */
	@Override
	public void remove(long id) {
		_productDao.delete(id);

	}

}
