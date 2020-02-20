package academy.everyonecodes.java.week9.set2.exercise2;

import java.util.List;
import java.util.Random;


public class PlayerComputer implements Player {

    private Random random = new Random();
    private List<Move> moves = Moves.get();

    @Override
    public Move play() {
        int position = random.nextInt(moves.size());
        return moves.get(position);
    }

    @Override
    public boolean wantsToPlayOtherRound() {
        return true;
    }
}

