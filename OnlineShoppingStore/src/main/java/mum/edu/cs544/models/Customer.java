package mum.edu.cs544.models;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("ROLE_USER")
public class Customer extends Person{
	
	@OneToMany(mappedBy="customer", fetch = FetchType.EAGER)
	private List<Order> order;
	
	@Column(name="user_deactivated")
    private boolean deactivated = false;
	
	public Customer(){
		
	}

	public boolean isDeactivated() {
		return deactivated;
	}

	public void setDeactivated(boolean deactivated) {
		this.deactivated = deactivated;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}
	
	
     
	
	
	

}
