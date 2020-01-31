package academy.everyonecodes.java.week2.lectureExercises.e1;

public class Robot {

    private String name;
    private double money;

    public Robot(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney () {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
