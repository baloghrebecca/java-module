package academy.everyonecodes.java.es.interfaces.e2;

public class BeginnerThief implements Thief {


    @Override
    public void open(Safe safe) {
        int skillLevel = 1;
        int securityPoints = safe.getSecurityPoints()-skillLevel;
        safe.setSecurityPoints(securityPoints);
    }
}
