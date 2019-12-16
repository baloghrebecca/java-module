package academy.everyonecodes.java.week2.set1.exercise4;

import java.util.List;

public class Menu {

    private String restaurantName;
    private List<Dish> dishes;

    public Menu(String restaurantName, List<Dish> dishes) {
        this.restaurantName = restaurantName;
        this.dishes = dishes;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
