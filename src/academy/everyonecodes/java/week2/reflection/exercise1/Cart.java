package academy.everyonecodes.java.week2.reflection.exercise1;

import java.util.List;

public class Cart {

    private List<CartItem> cartItems;
    private String owner;

    public Cart(List<CartItem> cartItems, String owner) {
        this.cartItems = cartItems;
        this.owner = owner;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public String getOwner() {
        return owner;
    }
}
