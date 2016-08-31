/**
 * 
 */
package mum.edu.cs544.services;

import java.util.Set;
import mum.edu.cs544.models.Product;

/**
 * @author Fish
 *
 */
public interface IProductService {	
    Product findById(long id);
    
    void updateProduct(Product product);
    
    Set<Product> getAllProducts();
    
    void remove(long id);   

}
