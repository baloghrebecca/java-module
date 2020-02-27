package academy.everyonecodes.java.es.ab.e2;

import java.util.List;

public class DiscountProvider {

    private int percentage;
    private List<String> applicableProducts;

    public DiscountProvider(int percentage, List<String> applicableProducts) {
        this.percentage = percentage;
        this.applicableProducts = applicableProducts;
    }

    public double apply(List<Product> products) {
        return products.stream()
                .filter(product -> applicableProducts.contains(product.getName()))
                .map(Product::getPrice)
                .mapToDouble(price -> price/100*5)
                .sum();
    }

}
