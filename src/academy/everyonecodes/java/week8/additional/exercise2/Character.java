package academy.everyonecodes.java.week8.additional.exercise2;

import java.util.Optional;

public class Character {

    private String name;
    private String alliance;
    private Optional<Integer> bookOfDeath;
    private String gender;

    public Character(String name, String alliance, Optional<Integer> bookOfDeath, String gender) {
        this.name = name;
        this.alliance = alliance;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }

    public Optional<Integer> getBookOfDeath() {
        return bookOfDeath;
    }

    public void setBookOfDeath(Optional<Integer> bookOfDeath) {
        this.bookOfDeath = bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
