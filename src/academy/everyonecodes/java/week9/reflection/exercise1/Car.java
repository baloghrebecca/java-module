package academy.everyonecodes.java.week9.reflection.exercise1;

public abstract class Car {

    private String brand;
    private String engineType;

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engineType = engineType;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngineType() {
        return engineType;
    }

    public String describe() {
        return "I am a " + this.brand + " car!";
    }

    public abstract String refuel();

}
