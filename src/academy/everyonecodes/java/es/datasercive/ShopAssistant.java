package academy.everyonecodes.java.es.datasercive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {

    public static Cart walkThroughShop(String nameOfPerson) {
        Scanner scanner = new Scanner(System.in);
        List<CartItem> cartItems = new ArrayList<>();
        String productName = "Nothing";
        double price;
        int amount;
        while (!productName.isBlank()) {
            System.out.println("What do you want to buy?");
            productName = scanner.nextLine();
            if (productName.isBlank()) {
                break;
            }
            System.out.println("What's the price?");
            price = scanner.nextDouble();
            System.out.println("What's the amount?");
            amount = scanner.nextInt();
            scanner.nextLine();
            Product product = new Product(productName, price);
            CartItem cartItem = new CartItem(product, amount);
            cartItems.add(cartItem);
        }

        return new Cart(cartItems, nameOfPerson);
    }


}
