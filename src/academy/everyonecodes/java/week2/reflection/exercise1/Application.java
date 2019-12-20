package academy.everyonecodes.java.week2.reflection.exercise1;

public class Application {

    public static void main(String[] args) {

    Product milk = new Product("Milk", 2.50);
    Product bread = new Product("Bread", 1.00);
    milk.setPricePerUnit(2.00);

    CartItem cartMilk = new CartItem(milk, 2);
    CartItem cartBread = new CartItem(bread,2);

    cartBread.setAmount(3);



    }
}
