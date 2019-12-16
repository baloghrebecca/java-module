package academy.everyonecodes.java.week2.set1.exercise2;

public class Car {

    private String color;
    private int yearBuilt;

    public Car(String color, int yearBuilt) {
        this.color = color;
        this.yearBuilt = yearBuilt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}
