package academy.everyonecodes.java.christmas.exercise1;

import java.util.Scanner;

public class Fitness {

    private static int caloriesRemaining (int caloriesIntake) {
        int caloriesForAnAdult = 2500;
        int caloriesRemaining = caloriesForAnAdult - caloriesIntake;
        return caloriesRemaining;
    }

    public static void main(String[] args) {
        System.out.println("How many calories did you eat today?");
        Scanner scanner = new Scanner (System.in);
        int caloriesIntake = scanner.nextInt();
        int caloriesRemaining = caloriesRemaining(caloriesIntake);
        System.out.println("You can eat " + caloriesRemaining + " more calories today.");
    }

}
