// Contact.java
package packt.addressbook;

public class Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String homePhone;
    private String email;
    private String workPhone;

    // Constructors
    public Contact() {
    }

    public Contact(String id, String firstName, String lastName, String homePhone, String email, String workPhone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.email = email;
        this.workPhone = workPhone;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
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

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", email='" + email + '\'' +
                ", workPhone='" + workPhone + '\'' +
                '}';
    }
    }
/*
    // Getter for last name, used in sorting
    public String getLastName() {
        return lastName;
    }
}*/

