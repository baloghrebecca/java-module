package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

import java.util.List;

public class Cashier {

    public void billCustomer(Cart cart) {
        String name = cart.getOwner();
        double totalPrice = 0;
        List<CartItem> cartItems = cart.getCartItems();
        for (CartItem cartItem : cartItems) {
            int amount = cartItem.getAmount();
            Product product = cartItem.getProduct();
            double pricePerUnit = product.getPricePerUnit();
            totalPrice = (pricePerUnit*amount) + totalPrice;
        }

        System.out.println(name + " has to pay " + totalPrice + " Euros.");
    }

}
