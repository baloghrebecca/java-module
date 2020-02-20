package academy.everyonecodes.java.week9.set2.exercise2;


public abstract class Move {
    private String name;
    private String nameOfLoser;

    public Move(String name, String nameOfLoser) {
        this.name = name;
        this.nameOfLoser = nameOfLoser;
    }

    public String getName() {
        return name;
    }

    public boolean isDefeating(academy.everyonecodes.java.week9.set2.exercise2.Move move) {
        return nameOfLoser.contains(move.getName());
    }
}
