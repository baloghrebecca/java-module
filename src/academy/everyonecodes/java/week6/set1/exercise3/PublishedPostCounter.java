package academy.everyonecodes.java.week6.set1.exercise3;

import java.util.List;

public class PublishedPostCounter {

    public int count(Blog blog) {
        int counter = 0;
        List<Post> posts = blog.getPosts();
        for (Post post : posts) {
            if (post.isPublished()) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
