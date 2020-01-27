package academy.everyonecodes.java.week6.set1.exercise1;

public class Customer {

    private String name;
    private String customerClass;

    public Customer(String name, String customerClass) {
        this.name = name;
        this.customerClass = customerClass;
    }

    public String getName() {
        return name;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }
}
