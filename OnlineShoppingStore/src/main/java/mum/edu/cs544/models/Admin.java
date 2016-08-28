package mum.edu.cs544.models;

import javax.persistence.*;

import org.hibernate.validator.constraints.Email;


@Entity
@DiscriminatorValue("ROLE_ADMIN")
public class Admin extends Person {

    @Column(name="admin_enabled")
    private boolean enabled = false;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Admin(String firstName, String lastName, Address address, String email, String password) {
        super(firstName, lastName, address, email,password);
    }

    public Admin(String email, String password) {
        super(email,password);
    }

    public Admin() {
        super();
    }

}
