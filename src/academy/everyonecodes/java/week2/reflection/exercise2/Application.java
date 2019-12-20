package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;

public class Application {

    public static void main(String[] args) {
        ShopAssistant derekShopAssistant = new ShopAssistant();
        ShopAssistant hanselShopAssistant = new ShopAssistant();

        Cart derekCart = derekShopAssistant.walkThroughShop("Derek");
        Cart hanselCart = hanselShopAssistant.walkThroughShop("Hansel");

        Cashier derekCashier = new Cashier();
        Cashier hanselCashier = new Cashier();

        derekCashier.billCustomer(derekCart);
        hanselCashier.billCustomer(hanselCart);

    }

}
