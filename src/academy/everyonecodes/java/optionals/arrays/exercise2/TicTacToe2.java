package academy.everyonecodes.java.optionals.arrays.exercise2;

import java.util.Scanner;

public class TicTacToe2 {

    private String[][] emptyGameField() {
        String[][] gameField = { {"[ ]","[ ]", "[ ]"}, //gameField[0]
                {"[ ]", "[ ]", "[ ]"}, //gameField[1]
                {"[ ]", "[ ]", "[ ]"}} ; //gameField[2]
        return gameField;
    }

   private void printGameField(String[][] gameField) {
       for (int i = 0; i < gameField.length; i++) {
           for (int j = 0; j < gameField[i].length; j++) { //gameField[i] -> gameField[0] -> size = 3
               System.out.print(gameField[i][j]); // {0.0, 0.1, 0.2}, {1.0, 1.1, 1.2,}, {2.0, 2.1, 2.2}
           }
           System.out.println(""); //println: print what is in there and breaks into the next line
   }
}

private boolean isFieldEmpty(String[][] gameField, int row, int column) {
    if (!gameField[row][column].equals("[ ]")) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There is already a symbol. Try another field.");
        row = scanner.nextInt();
        column = scanner.nextInt();
    }
    return true;
}

private void playOneRound(String[][] gameField, String playerName, String symbol) {
    System.out.println(playerName + " what's your next move?");
    Scanner scanner = new Scanner(System.in);
    int row = scanner.nextInt();
    int column = scanner.nextInt();
    while (isFieldEmpty(gameField, row, column)) {
        gameField[row][column] = "[" + symbol + "]";
        printGameField(gameField);
    }


}

public void play() {
    System.out.println("Hello player one, what's your name?");
    Scanner scanner = new Scanner(System.in);
    String playerOne = scanner.nextLine();
    System.out.println(playerOne + ", what's your symbol?");
    String symbolPlayerOne = scanner.nextLine();
    System.out.println("Hello player two, what's your name?");
    String playerTwo = scanner.nextLine();
    System.out.println(playerTwo + ", what's your symbol?");
    String symbolPlayerTwo = scanner.nextLine();
    String[][] gameField = emptyGameField();
    boolean isGameFinished = false;
    playOneRound(gameField, playerOne, symbolPlayerOne);
    playOneRound(gameField, playerTwo, symbolPlayerTwo);
    }

}
