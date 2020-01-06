package academy.everyonecodes.java.christmas.exercise3;

import java.util.Scanner;

public class Burger {

    public static void main(String[] args) {

        double price = 0.00;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Good day! What burger do you want?");
        String burgerChoice = scanner.nextLine();
        if (burgerChoice.equals("Big Great Burger")) {
            price = 6.50;
        }

        if (burgerChoice.equals("Mc Buttons Long Burger")) {
            price = 7.20;
        }

        if (burgerChoice.equals("Veggie Circuits Burger")) {
            price = 5.70;
        }


        System.out.println("Do you want fries with that?");
        boolean wantFries = scanner.nextBoolean();
        if (wantFries == true) {
            price = price + 2.50;
        }

        System.out.println("It's " + price + " Euro please.");

    }

}
