package academy.everyonecodes.java.week9.set2.exercise2;

public class Players {

    public static Player getFirstPlayer() {
        return new PlayerPerson();
    }

    public static Player getSecondPlayer() {
        return new PlayerComputer();
    }
}