package academy.everyonecodes.java.week9.set2.exercise2;


public class DecisionMaker {

    public String decisionMaker(Move moveFirst, Move moveSecond) {
        if (moveFirst.isDefeating(moveSecond)) {
            return "Player One is a winner!";
        }
        if (moveSecond.isDefeating(moveFirst)) {
            return "Player Two is a winner!";
        }
        return "Nobody wins! Try again!";
    }
}