/**
 * 
 */
package mum.edu.cs544.models;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Transient;

/**
 * @author Fish
 *
 */
@Entity
public class CartItem {
	
	@Id @GeneratedValue
	private long id;
	
	private long productId;
	
	private long customerId;
	
	private Double unitPrice;
	
	private int quantity;
	
	@Transient
	private double subtotal;
	
	public CartItem(){
		
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}
	
	public double getSubtotal(){
		return unitPrice * quantity;
				
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	

}
