package academy.everyonecodes.java.evaluation1.exercise2;

public class PictureNameExtractor {


    public String extract(String fileName) {

        String fileNameModified = fileNameModifier(fileName);

        if (doesFileNameContainADash(fileNameModified)) {
            return getFileNameWithoutDash(fileNameModified);
        }

        return fileNameModified;
    }


    private String getFileNameWithoutDash(String fileNameModified) {
        return fileNameModified.replace("-", " ");
    }


    private boolean doesFileNameContainADash(String fileNameModified) {
        return fileNameModified.contains("-");
    }


    private String fileNameModifier(String fileName) {
        String fileNameWithoutDate = fileName.substring(8);
        String fileNameWithoutPic = fileNameWithoutDate.substring(0, fileNameWithoutDate.length() - 7);
        String fileNameWithoutExtension = fileNameWithoutPic.replace(".jpg", "");
        return fileNameWithoutExtension.toLowerCase();
    }
}
