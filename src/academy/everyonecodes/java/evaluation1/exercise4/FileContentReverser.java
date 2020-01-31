package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.evaluation1.tools.FileReader;
import academy.everyonecodes.java.evaluation1.tools.FileWriter;

import java.util.Collections;
import java.util.List;

public class FileContentReverser {

    private FileReader fileReader = new FileReader();
    private FileWriter fileWriter = new FileWriter();


    public void reverse(String originalFile, String fileToWrite) {
        List<String> linesToReverse = fileReader.read(originalFile);
        Collections.reverse(linesToReverse);
        fileWriter.write(fileToWrite, linesToReverse);
    }
}
