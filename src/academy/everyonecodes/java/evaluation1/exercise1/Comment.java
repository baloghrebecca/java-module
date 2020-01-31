package academy.everyonecodes.java.evaluation1.exercise1;

public class Comment {

    private String title;
    private String content;
    private User author;

    public Comment(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }
}
