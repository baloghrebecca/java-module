package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.List;

public class ShopAssistant {

    public void findShoeForCustomer(ShoeCustomer customerOne) {
        Shoe shoeOne = new Shoe(39, "pink");
        Shoe shoeTwo = new Shoe(40, "red");
        Shoe shoeThree = new Shoe(38, "blue");
        Shoe shoeFour = new Shoe(42, "black");
        List<Shoe> shoes = List.of(shoeOne, shoeTwo, shoeThree, shoeFour);
        ShoeCustomer shoeTryon = new ShoeCustomer(customerOne.getSize());

        for (Shoe shoe : shoes) {
            boolean isRightShoeSize = shoeTryon.tryShoe(shoe);
            if (!isRightShoeSize) {
                System.out.println("Nope, this one doesn't fit, sorry.");
            } else {
                System.out.println("I will take the " + shoe.getColor() + " one.");
            }

        }

    }

}
