package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import academy.everyonecodes.java.week6.set1.exercise3.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class BlogCheckerTest {

    BlogChecker blogChecker = new BlogChecker();

    @Test
    void checkerWithBlogInsideWebsite() {
        Date dateOne = new Date(11,12,2019);
        Date dateTwo = new Date(12,3,2020);
        Date dateThree = new Date(10,7,2020);

        Post postOne = new Post("Hello", "Grießbrei Kakao", dateOne, true);
        Post postTwo = new Post("Hello2", "Grießbrei Kakao2", dateOne, false);
        Post postThree = new Post("Hello3", "Grießbrei Kakao3", dateOne, true);
        List<Post> posts = List.of(postOne, postTwo, postThree);
        Blog blog = new Blog("HALLO", posts, dateThree);
        Website website = new Website("http://www.griessbrei.at", "Hallo", Optional.of(blog));
        boolean result = blogChecker.hasBlog(website);
        Assertions.assertTrue(result);
    }

    @Test
    void checkerWithoutBlogInsideWebsite() {
        Date dateOne = new Date(11,12,2019);
        Date dateTwo = new Date(12,3,2020);
        Date dateThree = new Date(10,7,2020);

        Post postOne = new Post("Hello", "Grießbrei Kakao", dateOne, true);
        Post postTwo = new Post("Hello2", "Grießbrei Kakao2", dateOne, false);
        Post postThree = new Post("Hello3", "Grießbrei Kakao3", dateOne, true);
        List<Post> posts = List.of(postOne, postTwo, postThree);
        Blog blog = new Blog("HALLO", posts, dateThree);
        Website website = new Website("http://www.griessbrei.at", "Hallo", Optional.empty());
        boolean result = blogChecker.hasBlog(website);
        Assertions.assertFalse(result);
    }

}