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

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Address shippingAddress;

    private Date orderDate;
    // private Date deliveryDate;

    private Double totalOrderPrice = null;

    @JoinColumn(name = "order_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderLine> orderLineItems = new ArrayList<OrderLine>(); // can be Final
 
    private OrderStatus orderStatus;
    
    public Order() {

    }
}