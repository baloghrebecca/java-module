package academy.everyonecodes.java.week4.set1.exercise1;


public class PngChecker {

public boolean checker(String fileName) {
    String toLowerCase = fileName.toLowerCase();  //
    boolean isPng = toLowerCase.endsWith(".png");
    return isPng;

}

}
