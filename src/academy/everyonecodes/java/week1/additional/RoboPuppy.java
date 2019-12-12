package academy.everyonecodes.java.week1.additional;
import java.util.Scanner;

public class RoboPuppy {

    public static boolean isAtHome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are we at home?");
        boolean isHome = scanner.nextBoolean();
        return isHome;
    }

    public static void greetSomeone(){
        Scanner scanner = new Scanner(System.in);
        boolean isHome = isAtHome();
        System.out.println("Woof this person's name?");
        String name = scanner.nextLine();
        if (isHome || (name.equals("Derek") || name.equals("Hansel") || name.equals("Matilda"))) {
            System.out.println("Hi there, " + name + "!");
        }

    }

    public static void main(String[] args) {
      greetSomeone();

    }

}
