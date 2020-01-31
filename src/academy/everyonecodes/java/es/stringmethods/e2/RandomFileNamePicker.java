package academy.everyonecodes.java.es.stringmethods.e2;

import java.util.List;
import java.util.Random;

public class RandomFileNamePicker {
    public String pick(List<String> fileNames) {
        Random random = new Random();
        return getRandomFile(fileNames, random);

    }

    private String getRandomFile(List<String> fileNames, Random random) {
        return fileNames.get(random.nextInt(fileNames.size()));
    }
}
