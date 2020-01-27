package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;

import java.util.Optional;

public class BlogCreationDateRetriever {

    public Optional<Date> retrieve(Website website) {
        BlogChecker blogChecker = new BlogChecker();
        if (blogChecker.hasBlog(website)) {
            Blog blog = website.getBlog().get();
            return Optional.of(blog.getDateCreated());
        }
        return Optional.empty();
    }
}
