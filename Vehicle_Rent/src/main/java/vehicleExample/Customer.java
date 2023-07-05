package vehicleExample;

public class Customer {

    private String customerId;
    private String firstName;
    private String lastName;

    public String getCustomerId() {
        return customerId;
    }

    public Customer(String customerId, String firstName, String lastName) {
        super();
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

}