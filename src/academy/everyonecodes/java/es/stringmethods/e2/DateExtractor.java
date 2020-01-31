package academy.everyonecodes.java.es.stringmethods.e2;

public class DateExtractor {


    public String extractor(String fileName) {
        return getDateOutOfFileName(fileName);

    }

    private String getDateOutOfFileName(String fileName) {
        return fileName.substring(6, fileName.length()-4);
    }
}
