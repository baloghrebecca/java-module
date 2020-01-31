package academy.everyonecodes.java.es.datasercive;

public class Product {

    private String nameOfProduct;
    private double pricePerUnit;

    public Product(String nameOfProduct, double pricePerUnit) {
        this.nameOfProduct = nameOfProduct;
        this.pricePerUnit = pricePerUnit;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
