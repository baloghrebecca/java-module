package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class Club {

        private static boolean isAdult() {
            System.out.println("Are you 18 or older?");
            Scanner scanner = new Scanner(System.in);
            boolean isAdult = scanner.nextBoolean();
            return isAdult;
        }

        private static boolean isWearingAHat() {
            System.out.println("Are you wearing a hat?");
            Scanner scanner = new Scanner(System.in);
            boolean isWearingAHat = scanner.nextBoolean();
            return isWearingAHat;
        }

        private static boolean knowsSecretPassword() {
            System.out.println("What is the secret password?");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            boolean knowsPassword = true;
            if (!password.equals("Hokopoko")) {
                knowsPassword = false;
        }

            return knowsPassword;
        }

        public static void main(String[] args) {
            boolean isAdult = isAdult();
            boolean isWearingAHat = isWearingAHat();
            boolean knowsSecretPassword = knowsSecretPassword();
            if (isAdult && isWearingAHat && knowsSecretPassword) {
                System.out.println("You can enter our club.");
            } else {
                System.out.println("I'm sorry, but you cannot enter our club.");
            }
        }
    }



