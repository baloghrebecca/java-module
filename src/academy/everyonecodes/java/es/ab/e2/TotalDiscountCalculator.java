package academy.everyonecodes.java.es.ab.e2;

import java.util.List;

public class TotalDiscountCalculator  {

    public double calculate(List<Product> products) {
        double priceTotal = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        double totalDiscount = Discounts.get().stream()
                .map(discountProvider -> discountProvider.apply(products))
                .mapToDouble(Double::doubleValue)
                .sum();
        return priceTotal-totalDiscount;
    }


}
