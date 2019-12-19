package academy.everyonecodes.java.week2.set2.exercise3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HikerGatherer {

    public static List<Hiker> gather() {

        List<Hiker> hikers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        while(!name.equals("")) {
            System.out.println("What's your phone number?");
            int phoneNumber = scanner.nextInt();
            scanner.nextLine(); //we need this scanner so it forgets about the "enter"
            Hiker newHiker = new Hiker(name, phoneNumber);
            hikers.add(newHiker);

            System.out.println("What is your name?");
            name = scanner.nextLine();
        }

        return hikers;
    }

}
