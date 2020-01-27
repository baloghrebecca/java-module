package academy.everyonecodes.java.week6.set1.exercise4;

public class BlogChecker {

    public boolean hasBlog(Website website) {
        return website.getBlog().isPresent();
    }
}


