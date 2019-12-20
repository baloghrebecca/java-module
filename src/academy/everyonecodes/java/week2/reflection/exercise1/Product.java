package academy.everyonecodes.java.week2.reflection.exercise1;

public class Product {

    private String productName;
    private double pricePerUnit;

    public Product(String productName, double pricePerUnit) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
