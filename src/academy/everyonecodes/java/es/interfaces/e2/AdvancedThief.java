package academy.everyonecodes.java.es.interfaces.e2;

public class AdvancedThief implements Thief {

    @Override
    public void open(Safe safe) {
        int skillLevel = 2;
        int securityPoints = safe.getSecurityPoints()-skillLevel;
        safe.setSecurityPoints(securityPoints);
    }
}
