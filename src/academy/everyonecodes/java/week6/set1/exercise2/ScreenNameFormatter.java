package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;

public class ScreenNameFormatter {

    public String create(Customer customer) {
        if (customer.getCustomerClass().equals("Business")) {
            return customer.getName().toUpperCase();
        }
        return customer.getName().toLowerCase();
    }


}
