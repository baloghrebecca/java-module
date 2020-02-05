package academy.everyonecodes.java.week7.set2.exercise5;

public class HappinessRecord {

    private String country;
    private int rank;
    private double score;

    public HappinessRecord(String country, int rank, double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }

}
