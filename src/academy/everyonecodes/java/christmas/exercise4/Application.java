package academy.everyonecodes.java.christmas.exercise4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("How many episodes have you watched?");
        Scanner scanner = new Scanner (System.in);
        int numberOfMinutes = scanner.nextInt();

        TotalTime totalTimeCalculation = new TotalTime();
        int totalTime = totalTimeCalculation.calculateTotalTime(numberOfMinutes);
        System.out.println("The total amount of time spent watching those episodes is " + totalTime + " minutes.");

    }

}
