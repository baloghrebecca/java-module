package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;


public class TotalDiscountCalculator {


    public double calculate(List<Product> products) {

        double totalPrice = products.stream()
                .map(Product::getPrice)
                .mapToDouble(p -> p)
                .sum();

        double discountTotal = Discounts.get().stream()
                .map(discount -> discount.apply(products))
                .mapToDouble(d -> d)
                .sum();

        return totalPrice - discountTotal;

    }


}
