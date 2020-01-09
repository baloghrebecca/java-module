package academy.everyonecodes.java.week3.set2.exercise6;

public class StringStorageCalculator {
    public int calculate(String word) {
        int numberOfLetters = word.length();
        int numberOfBits = (numberOfLetters * 16) + 32;
        return numberOfBits;
    }
}
