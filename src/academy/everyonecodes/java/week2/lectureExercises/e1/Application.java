package academy.everyonecodes.java.week2.lectureExercises.e1;

public class Application {

    public static void main(String[] args) {

        Robot hansel = new Robot("Hansel", 5.00);
        Robot derek = new Robot("Derek", 7.00);

        double hanselMoney = hansel.getMoney();
        hansel.setMoney(hanselMoney + 2.00);

        double derekMoney = derek.getMoney();
        derek.setMoney(derekMoney + 2.00);

        double totalMoney = derek.getMoney() + hansel.getMoney();
        System.out.println(totalMoney);

    }

}
