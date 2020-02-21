package academy.everyonecodes.java.week9.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void describe() {
        DieselCar dieselCar = new DieselCar("Mercedes");
        String expected = "I am a Mercedes car!";
        String result = dieselCar.describe();
        assertEquals(expected, result);
    }
}