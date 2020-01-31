package academy.everyonecodes.java.es.datasercive;

import java.util.List;

public class Cart {

    private List<CartItem> cartItemList;
    private String cartOwner;

    public Cart(List<CartItem> cartItemList, String cartOwner) {
        this.cartItemList = cartItemList;
        this.cartOwner = cartOwner;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public String getCartOwner() {
        return cartOwner;
    }

}
