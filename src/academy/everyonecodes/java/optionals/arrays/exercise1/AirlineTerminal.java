package academy.everyonecodes.java.optionals.arrays.exercise1;

import java.util.List;
import java.util.Scanner;

public class AirlineTerminal {

    private String[] getItems() {
        String[] items = new String[5];
        System.out.println("Please tell me your 5 items:");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            String item = scanner.nextLine();
            items[i] = item;
        }
        return items;
    }

    private boolean isAnItemSuspicious(String[] items) {
        boolean isSuspicious = false;
        for (String i : items){
            if (i.equals("Bomb")) {
                isSuspicious = true;
            }
        }
        return isSuspicious;
    }

    public void doThePassengerCheckIn() {

        System.out.println("WELCOME TO EC AIRLINES");
        String[] items = getItems();
        boolean isSuspicious = isAnItemSuspicious(items);
        System.out.println("Thank you for boarding, we will check your items...");
        if (isSuspicious) {
            System.out.println("Sorry, we cannot allow you to proceed.");
        } else {
            System.out.println("All items are good to go. Enjoy your flight!");
        }

    }


}
