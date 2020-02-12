package academy.everyonecodes.java.week8.set2.exercise1;

public class ThiefAttemptCounter {


    public int countAttempts(Thief thief, Safe safe) {
        int numbersOfAttempts = 0;
        while (safe.getDifficultyPoints() > 0) {
            thief.open(safe);
            numbersOfAttempts++;
        }
        return numbersOfAttempts;
    }

}
