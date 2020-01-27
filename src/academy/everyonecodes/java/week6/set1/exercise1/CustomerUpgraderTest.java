package academy.everyonecodes.java.week6.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerUpgraderTest {

    CustomerUpgrader customerUpgrader = new CustomerUpgrader();

    @Test
    void upgradeWithoutExceptions() {
        Customer customerOne = new Customer("Rebecca", "Economy");
        customerOne = customerUpgrader.upgrade(customerOne);
        Customer customerOneExpectation = new Customer("Rebecca", "Business");
        Assertions.assertEquals(customerOneExpectation.getCustomerClass(), customerOne.getCustomerClass());

    }



    @Test
    void upgradeWithBusinessClass() {
        Customer customerOne = new Customer("Rebecca", "Business");
        customerOne = customerUpgrader.upgrade(customerOne);
        Customer customerOneExpectation = new Customer("Rebecca", "Business");
        Assertions.assertEquals(customerOneExpectation.getCustomerClass(), customerOne.getCustomerClass());

    }

    //There is no edge case as it will always receive economy or business and return business

}
