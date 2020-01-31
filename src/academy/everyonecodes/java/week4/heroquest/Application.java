package academy.everyonecodes.java.week4.heroquest;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hi there! Please enter your preferred super secret password for the super secret website:");
        Scanner scanner = new Scanner(System.in);
        String userPassword = scanner.nextLine();
        PasswordCheck passwordCheck = new PasswordCheck();
        boolean isValid = passwordCheck.passwordChecker(userPassword);

        if (isValid) {
            System.out.println("Your password check was a success! You will be forwarded to the super secret landing page shortly!");
        } else {

            for (int i = 0; i < 3; i++) {
                System.out.println("Unfortunately your password did not match our rules. Please try again:");
                userPassword = scanner.nextLine();
                isValid = passwordCheck.passwordChecker(userPassword);
                if (isValid) {
                    System.out.println("Your password check was a success! Please confirm your e-mail to login with your account.");
                    break;
                }

            }
        }
        if (!isValid) {
            System.out.println("You have entered a wrong password too many times. We are sorry, you have run out of tries.");

        }


    }

}
