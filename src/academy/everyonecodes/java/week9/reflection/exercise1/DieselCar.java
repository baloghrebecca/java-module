package academy.everyonecodes.java.week9.reflection.exercise1;

public class DieselCar extends Car{
    public DieselCar(String brand) {
        super(brand, "Diesel");
    }

    @Override
    public String refuel() {
        return "I am refilling my diesel tank!";
    }
}
