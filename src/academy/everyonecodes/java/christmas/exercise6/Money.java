package academy.everyonecodes.java.christmas.exercise6;

import java.util.List;

public class Money {

    public static void main(String[] args) {

    List<Integer> amounts = List.of(23, 54, 12, 3, 11);
    int totalAmount = 0;

    for (int amount : amounts) {
        totalAmount = totalAmount + amount;
    }

        System.out.println("The total amount is "+ totalAmount);

    }
}
