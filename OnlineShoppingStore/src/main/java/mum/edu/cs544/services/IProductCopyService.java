/**
 * 
 */
package mum.edu.cs544.services;

import java.util.Set;

import mum.edu.cs544.models.ProductCopy;


/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
public interface IProductCopyService {
	void addProductCopy(ProductCopy copy);
    void updateProductCopy(ProductCopy copy);
    void deleteProductCopy(long id);
    ProductCopy findById(long id);
    Set<ProductCopy> getAllProductCopy();
}
