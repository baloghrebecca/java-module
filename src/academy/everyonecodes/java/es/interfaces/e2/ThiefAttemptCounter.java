package academy.everyonecodes.java.es.interfaces.e2;

public class ThiefAttemptCounter {

    public int countAttempts(Thief thief, Safe safe) {
        int attempts = 0;
        while (safe.getSecurityPoints() != 0) {
            thief.open(safe);
            attempts++;
        }
        System.out.println(attempts);
        return attempts;
    }


}
