package academy.everyonecodes.java.week9.set2.exercise2;

public class Game {

    private Player playerOne = Players.getFirstPlayer();
    private Player playerComputer = Players.getSecondPlayer();
    private DecisionMaker decision = new DecisionMaker();

    public void playTheGame() {
        System.out.println("Let's play the game!");
        boolean wantToPlayTheGame = true;
        while (wantToPlayTheGame) {
            playSingleRound(playerOne, playerComputer);
            wantToPlayTheGame = askIfWantsToKeepPlaying(playerOne, playerComputer);
        }
        System.out.println("Cya!");
    }

    private void playSingleRound(Player playerOne, Player playerTwo) {
        Move moveFirst = playerOne.play();
        Move moveSecond = playerTwo.play();
        System.out.println("First Player chose: " + moveFirst.getName());
        System.out.println("Player Computer chose: " + moveSecond.getName());
        String winner = decision.decisionMaker(moveFirst, moveSecond);
        System.out.println(winner);
    }

    private boolean askIfWantsToKeepPlaying(Player playerOne, Player playerTwo) {
        return playerOne.wantsToPlayOtherRound() && playerTwo.wantsToPlayOtherRound();
    }

}