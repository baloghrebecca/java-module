package academy.everyonecodes.java.week8.set2.exercise1;

import java.util.Objects;

public class Safe {

    private int difficultyPoints;
    private int securityLevel;

    public Safe(int difficultyPoints, int securityLevel) {
        this.difficultyPoints = difficultyPoints;
        this.securityLevel = securityLevel;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setDifficultyPoints(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Safe safe = (Safe) o;
        return difficultyPoints == safe.difficultyPoints &&
                securityLevel == safe.securityLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(difficultyPoints, securityLevel);
    }
}
