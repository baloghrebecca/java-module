package academy.everyonecodes.java.week8.additional.exercise2;

import academy.everyonecodes.java.evaluation1.tools.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class GotReader {

    String file = "src/academy/everyonecodes/java/week8/additional/files/got-characters.csv";
    private FileReader fileReader = new FileReader();
    private GotParser gotParser = new GotParser();

    public List<Character> reader() {
        List<String> lines = fileReader.read(file);
        return lines.stream()
                .skip(1)
                .map(e -> gotParser.parseLine(e))
                .collect(Collectors.toList());
    }

}
