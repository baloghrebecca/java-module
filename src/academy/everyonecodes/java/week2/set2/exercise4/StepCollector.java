package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepCollector {
    public static List<Integer> collect() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> steps = new ArrayList<>();
        List<String> persons = List.of("Matilda", "Hansel", "Derek");
        int step = 0;
        for (int i = 0; i < 3 ; i++) {
            System.out.println(persons.get(i) + " how many steps did you walk?");
            step = scanner.nextInt();
            steps.add(step);
        }

        return steps;
    }
}
