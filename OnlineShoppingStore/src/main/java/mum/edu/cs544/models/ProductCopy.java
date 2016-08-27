package mum.edu.cs544.models;
/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
import javax.persistence.*;

@Entity
public class ProductCopy {
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;

	public ProductCopy() {
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public long getId() {
		return id;
	}
}
