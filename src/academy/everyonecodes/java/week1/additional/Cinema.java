package academy.everyonecodes.java.week1.additional;
import java.util.Scanner;

public class Cinema {

    public static boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        boolean isWearingHat = scanner.nextBoolean();
        return isWearingHat;
    }

    public static boolean isBringingPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you bringing a pet?");
        boolean isBringingPet = scanner.nextBoolean();
        return isBringingPet;
    }

    public static void main(String[] args) {


        if (!isWearingAHat() && !isBringingPet()) {
            System.out.println("Welcome to our cinema, how may I assist you?");
        } else {
            System.out.println("I'm sorry, you are not allowed to enter.");
        }

    }

}
