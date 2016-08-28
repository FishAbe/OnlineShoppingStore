package mum.edu.cs544.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("ROLE_USER")
public class Customer extends Person{
	
	@OneToOne
	private Order order;
	
	@Column(name="user_deactivated")
    private boolean deactivated = false;
	
	public Customer(){
		
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public boolean isDeactivated() {
		return deactivated;
	}

	public void setDeactivated(boolean deactivated) {
		this.deactivated = deactivated;
	}
	
	
     
	
	
	

}
