package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountTest {


    Discount discount = new Discount(5, List.of("wine"));

    private static Stream<Arguments> correctDiscount() {
        return Stream.of(
                Arguments.of(0, List.of()),
                Arguments.of(1, List.of(new Product("wine", 20.00))),
                Arguments.of(2, List.of(new Product("wine", 20.00), new Product("wine", 20.00)))
        );
    }


    @ParameterizedTest
    @MethodSource("correctDiscount")
    void apply(double expected, List<Product> input) {
        double result = discount.apply(input);
        assertEquals(expected, result);
    }


}