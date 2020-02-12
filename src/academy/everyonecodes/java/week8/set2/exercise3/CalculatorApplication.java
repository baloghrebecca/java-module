package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.List;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation:");
        String operationString = scanner.nextLine();
        List<String> operationToList = List.of(operationString.split(" "));
        Calculation calculation = new Calculation(operationToList.get(1), Double.parseDouble(operationToList.get(0)), Double.parseDouble(operationToList.get(2)));
        if (calculator.calculate(calculation).isPresent()) {
            System.out.println("Solution: " + calculator.calculate(calculation).get());
        }
        System.out.println("Solution: operation not available");
    }
}
