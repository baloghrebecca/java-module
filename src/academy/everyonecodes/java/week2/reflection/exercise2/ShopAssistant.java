package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {

    public Cart walkThroughShop(String nameOfOwner) {
        System.out.println("Hello " + nameOfOwner + ", welcome to our shop!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product do you want to buy?");
        String nameOfProduct = scanner.nextLine();
        List<CartItem> cartItems = new ArrayList<>();

        while(!nameOfProduct.equals("")) {
            System.out.println("How much does it cost?");
            double price = scanner.nextDouble();
            System.out.println("How much do you want?");
            int amount = scanner.nextInt();
            scanner.nextLine();
            Product product = new Product(nameOfProduct,price);
            CartItem item = new CartItem(product, amount);
            cartItems.add(item);
            System.out.println("Thank you, we will add that in the cart!");

            System.out.println("What product do you want to buy?");
            nameOfProduct = scanner.nextLine();
        }

        Cart newCart = new Cart(cartItems, nameOfOwner);

        return newCart;
    }

}
