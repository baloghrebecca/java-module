package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        StepCollector newCollector = new StepCollector();
        List<Integer> steps = newCollector.collect();

        AverageCalculator calculator = new AverageCalculator();
        double average = calculator.calculateAverage(steps);

        DistanceCalculator calculatorDistance = new DistanceCalculator();
        double distance = calculatorDistance.calculateDistanceInKilometers(average);

        System.out.println("The average steps were " + average + " and the average distance in kilometers was " + distance);




    }




}
