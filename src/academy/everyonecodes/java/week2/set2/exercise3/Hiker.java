package academy.everyonecodes.java.week2.set2.exercise3;

public class Hiker {

    private String name;
    private int telephoneNumber;

    public Hiker(String name, int telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
