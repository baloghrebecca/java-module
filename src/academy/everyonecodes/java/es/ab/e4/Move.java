package academy.everyonecodes.java.es.ab.e4;

public abstract class Move {

    private String name;
    private String beats;

    public abstract boolean fight(Move move);

    public Move(String name, String beats) {
        this.name = name;
        this.beats = beats;
    }

    public String getName() {
        return name;
    }

    public String getBeats() {
        return beats;
    }
}
