/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.ProductCopyDAO;
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
    private ProductCopyDAO productcopyDao;
    @Override
    public void addProductCopy(ProductCopy copy) {
        productcopyDao.save(copy);
    }

    @Override
    public void updateProductCopy(ProductCopy copy) {
        productcopyDao.save(copy);
    }

    @Override
    public void deleteProductCopy(long id) {
        productcopyDao.delete(id);
    }

    @Override
    public ProductCopy findById(long id) {
        return productcopyDao.findOne(id);
    }

    @Override
    public Set<ProductCopy> getAllProductCopies() {
        Set<ProductCopy> result = new HashSet<>();
        productcopyDao.findAll().forEach(item -> result.add(item));
        return result;
    }
}

