package academy.everyonecodes.java.week8.set1.exercise4;

public class Superman implements Superhero {

    @Override
    public String getPrivateName() {
        return "Clark Kent";
    }

    @Override
    public String getSuperheroName() {
        return "Superman";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
