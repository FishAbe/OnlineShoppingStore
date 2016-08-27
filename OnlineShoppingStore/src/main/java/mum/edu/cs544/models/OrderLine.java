package mum.edu.cs544.models;
/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
import java.util.Date;

import javax.persistence.*;

@Entity
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Product product;
    private int quantity = 1;
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public OrderLine() {

    }

    public OrderLine(Product product, int quantity) {
        super();
        this.product = product;
        this.quantity = quantity;
    }
}