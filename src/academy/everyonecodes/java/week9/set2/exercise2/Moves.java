package academy.everyonecodes.java.week9.set2.exercise2;

import java.util.List;

public class Moves {
    private static List<Move> moves = List.of(
            new Rock(),
            new Scissors(),
            new Paper()
    );
    public static List<Move> get() {
        return moves;
    }
}