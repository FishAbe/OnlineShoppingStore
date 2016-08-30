package mum.edu.cs544.models;
/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import mum.edu.cs544.models.Address;
import mum.edu.cs544.models.OrderLine;
import mum.edu.cs544.models.Enum.OrderStatus;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Embedded
    private Address shippingAddress;

    private Date orderDate;
    // private Date deliveryDate;

    private Double totalOrderPrice = null;
    
    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customerId")
	private Customer customer;
    
   
    @JoinColumn(name = "order_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderLine> orderLineItems = new ArrayList<OrderLine>();
    
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    
    public Order() {

    }

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Double getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public void setTotalOrderPrice(Double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}

	public List<OrderLine> getOrderLineItems() {
		return orderLineItems;
	}

	public void setOrderLineItems(List<OrderLine> orderLineItems) {
		this.orderLineItems = orderLineItems;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
	
    
}