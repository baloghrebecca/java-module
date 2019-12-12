package academy.everyonecodes.java.week1.set2.exercise1;
import java.util.Scanner;
//this is needed to listen()


public class DogTreats {

    public static int calculateJumps(int foodType){
        int numberOfJumps = 6;
        int totalNumberOfJumps = numberOfJumps * foodType;
        return totalNumberOfJumps;
    }

    public static int calculateBarks(int foodType) {
        int numberOfBarks = 1;
        int totalNumberOfBarks = 1 + foodType;
        return totalNumberOfBarks;
    }


    public static void main(String[] args) {
        System.out.println("Woof food do I get today?!");
        Scanner scanner = new Scanner(System.in);
        //installing the robocode listen() will be asked in the terminal/console

        int foodType = scanner.nextInt();
        int jump = calculateJumps(foodType);
        int bark = calculateBarks(foodType);
        System.out.println("I will jump " + jump + " times and bark " + bark + " times!");

    }

}
