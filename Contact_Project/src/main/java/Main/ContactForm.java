package Main;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContactForm {
	@NotNull
    @Size(min=2, max=30)
    private String firstName, lastName;
    
	@NotNull
	@Size(min=4, max=50)
	private String email;
	
	@Size(min=10, max=10)
	private String numberPhone;
	
	private Long id;
	
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}	

	public String toString() {
        return "Contact(Prénom: " + this.firstName + ", Nom: "+ this.lastName + ", Numero telephone: " + this.numberPhone + ", Email: " + this.email + ")";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
