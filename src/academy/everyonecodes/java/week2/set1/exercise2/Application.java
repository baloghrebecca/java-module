package academy.everyonecodes.java.week2.set1.exercise2;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the color of your car?");
        String color = scanner.nextLine();

        System.out.println("What year was it built?");
        int yearBuilt = scanner.nextInt();

        Car newCar = new Car(color, yearBuilt);


    }


}
