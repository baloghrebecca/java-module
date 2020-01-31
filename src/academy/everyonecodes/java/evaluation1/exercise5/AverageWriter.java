package academy.everyonecodes.java.evaluation1.exercise5;


import academy.everyonecodes.java.evaluation1.tools.FileReader;
import academy.everyonecodes.java.evaluation1.tools.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class AverageWriter {

    private FileReader fileReader = new FileReader();
    private FileWriter fileWriter = new FileWriter();

    public void write(String originalFile, String fileToWrite) {

        List<String> lines = fileReader.read(originalFile);
        List<String> averagesIntoString = new ArrayList<>();
        for (String line : lines) {
            List<String> lineSplit = List.of(line.split(" "));
            double sum = getSum(lineSplit);
            double average = sum / lineSplit.size();
            averagesIntoString.add(String.valueOf(average));
        }

        fileWriter.write(fileToWrite, averagesIntoString);
    }

    private double getSum(List<String> lineSplit) {
        double sum = 0;
        for (String splitLine : lineSplit) {
            sum += Double.parseDouble(splitLine);
        }
        return sum;
    }
}
