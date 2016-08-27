package mum.edu.cs544.models;
/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import org.hibernate.validator.constraints.NotEmpty;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Product {

    @Id @GeneratedValue
    private long id;

    @NotEmpty(message = "Product names may not be empty")
    private String name;

    @Lob @NotEmpty(message="Description may not be empty")
    private String description;

    @DecimalMin(value = "0")
    private Double price;

    @DecimalMin(value = "0", message = "Minimum discount should be at least 0.0")
    @DecimalMax(value = "100", message = "Maximum discount should be at most 100.0")
    private Double discount;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    //@JsonIgnore
    private List<ProductCopy> productCopies = new ArrayList<ProductCopy>();

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Product() {

    }
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<ProductCopy> getProductCopies() {
		return productCopies;
	}

	public void setProductCopies(List<ProductCopy> productCopies) {
		this.productCopies = productCopies;
	}
}
