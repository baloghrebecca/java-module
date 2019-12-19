package academy.everyonecodes.java.week2.set2.exercise5;

public class Application {

    public static void main(String[] args) {

    ShoeCustomer matilda = new ShoeCustomer(38);
    ShoeCustomer hansel = new ShoeCustomer(42);

    ShopAssistant shopOne = new ShopAssistant();
    shopOne.findShoeForCustomer(matilda);
    shopOne.findShoeForCustomer(hansel);

    }
}
