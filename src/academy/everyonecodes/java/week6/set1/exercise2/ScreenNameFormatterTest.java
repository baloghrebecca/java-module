package academy.everyonecodes.java.week6.set1.exercise2;


import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenNameFormatterTest {

    ScreenNameFormatter screenNameFormatter = new ScreenNameFormatter();

    @Test
    void formatterBusinessClass() {
        Customer customerWithBusinessClass = new Customer("Rebecca", "Business");
        String result = screenNameFormatter.create(customerWithBusinessClass);
        Assertions.assertEquals("REBECCA", result);
    }

    @Test
    void formatterEconomyClass() {
        Customer customerWithEconomyClass = new Customer("Rebecca", "Economy");
        String result = screenNameFormatter.create(customerWithEconomyClass);
        Assertions.assertEquals("rebecca", result);
    }

//there is no edge case, as the customerClass can only be economy or business class.

}