package academy.everyonecodes.java.week2.set1.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void explain(Menu menu) {
        List<Dish> dishes = menu.getDishes();
        for (Dish dish : dishes) {
            System.out.println(dish.getName() + " for " + dish.getPrice() + " Euro.");
        }

    }

    public static void main(String[] args) {

        List <Dish> dishes = new ArrayList();

        Dish dishOne = new Dish("Lasagna", 7.6);
        Dish dishTwo = new Dish("Cesear Salad", 5.8);
        Dish dishThree = new Dish("Fish & Chips", 3.9);

        dishes.add(dishOne);
        dishes.add(dishTwo);
        dishes.add(dishThree);

        Menu pizzaria = new Menu("Pizzaria", dishes);

        explain(pizzaria);


    }

}
