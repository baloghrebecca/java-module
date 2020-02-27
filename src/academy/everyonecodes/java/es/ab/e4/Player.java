package academy.everyonecodes.java.es.ab.e4;

public class Player {

    private String name;
    private Move move;

    public Player(String name, Move move) {
        this.name = name;
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public Move getMove() {
        return move;
    }
}
