/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IPaymentDAO;
import mum.edu.cs544.dao.IProductCopyDAO;
import mum.edu.cs544.models.ProductCopy;
import mum.edu.cs544.services.IProductCopyService;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Service
@Transactional
public class ProductCopyService implements IProductCopyService {
    @Autowired
    private IProductCopyDAO _productcopyDao;
    
    @Autowired
	public ProductCopyService(IProductCopyDAO orderDao){
    	_productcopyDao = orderDao;
	}
    
    @Override
    public void addProductCopy(ProductCopy copy) {
        _productcopyDao.save(copy);
    }

    @Override
    public void updateProductCopy(ProductCopy copy) {
        _productcopyDao.save(copy);
    }

    @Override
    public void deleteProductCopy(long id) {
        _productcopyDao.delete(id);
    }

    @Override
    public ProductCopy findById(long id) {
        return _productcopyDao.findOne(id);
    }

    @Override
    public Set<ProductCopy> getAllProductCopies() {
        Set<ProductCopy> result = new HashSet<>();
        _productcopyDao.findAll().forEach(item -> result.add(item));
        return result;
    }
}

