package academy.everyonecodes.java.week9.set2.exercise2;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PlayerPerson implements Player {
    private Scanner scanner = new Scanner(System.in);
    private List<Move> moves = Moves.get();


    @Override
    public Move play() {
        Optional<Move> oMove = Optional.empty();
        while (oMove.isEmpty()) {
            oMove = askForNextMove();
        }
        return oMove.get();
    }

    private Optional<Move> askForNextMove() {
        System.out.println("These are your options:" + getMoveNames() + "\n" +
                "Choose one:");
        String moveChosen = scanner.nextLine();
        return moves.stream()
                .filter(move -> move.getName().equalsIgnoreCase(moveChosen))
                .findFirst();

    }

    private String getMoveNames() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(", "));
    }


    @Override
    public boolean wantsToPlayOtherRound() {
        System.out.println("Do you want to play again? (y/n)");
        String wantsToContinue = scanner.nextLine();
        return wantsToContinue.equalsIgnoreCase("y");
    }
}


