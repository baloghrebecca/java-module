package academy.everyonecodes.java.es.interfaces.e2;

public class Safe {

    private int securityPoints;
    private String securityLevel;

    public Safe(int securityPoints, String securityLevel) {
        this.securityPoints = securityPoints;
        this.securityLevel = securityLevel;
    }

    public int getSecurityPoints() {
        return securityPoints;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityPoints(int securityPoints) {
        this.securityPoints = securityPoints;
    }
}
