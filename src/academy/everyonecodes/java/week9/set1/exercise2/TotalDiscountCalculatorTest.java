package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TotalDiscountCalculatorTest {

    TotalDiscountCalculator totalDiscountCalculator = new TotalDiscountCalculator();

    private static Stream<Arguments> correctDiscount() {
        return Stream.of(
                Arguments.of(0, List.of()),
                Arguments.of(19.00, List.of(new Product("wine", 20.00))),
                Arguments.of(38.00, List.of(new Product("wine", 20.00), new Product("tomato", 20.00)))
        );
    }


    @ParameterizedTest
    @MethodSource("correctDiscount")
    void apply(double expected, List<Product> products) {
        double result = totalDiscountCalculator.calculate(products);
        assertEquals(expected, result);
    }
}