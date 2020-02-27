package academy.everyonecodes.java.es.ab.e2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class DiscountProviderTest {

    DiscountProvider discountProvider = new DiscountProvider(5, List.of("Wine"));

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(5, List.of(new Product("Wine", 100)))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void apply(double expected, List<Product> products) {
        double result = discountProvider.apply(products);
        Assertions.assertEquals(5, result);
    }


}