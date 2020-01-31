package academy.everyonecodes.java.evaluation1.exercise1;

public class AuthorEmailRetriever {

    public String retrieve(Comment comment) {
        return getEmail(comment);
    }

    private String getEmail(Comment comment) {
        return comment.getAuthor().getEmail();
    }
}
