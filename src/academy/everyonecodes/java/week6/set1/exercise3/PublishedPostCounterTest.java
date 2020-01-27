package academy.everyonecodes.java.week6.set1.exercise3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PublishedPostCounterTest {

    PublishedPostCounter publishedPostCounter = new PublishedPostCounter();

    @Test
    void counterWithSeveralPublishedPosts() {
        Date dateOne = new Date(11,12,2019);
        Date dateTwo = new Date(12,3,2020);
        Date dateThree = new Date(10,7,2020);

        Post postOne = new Post("Hello", "Grießbrei Kakao", dateOne, true);
        Post postTwo = new Post("Hello2", "Grießbrei Kakao2", dateOne, false);
        Post postThree = new Post("Hello3", "Grießbrei Kakao3", dateOne, true);
        List<Post> posts = List.of(postOne, postTwo, postThree);
        Blog blog = new Blog("HALLO", posts, dateThree);
        int result = publishedPostCounter.count(blog);
        Assertions.assertEquals(2, result);
    }


    @Test
    void counterWithoutPublishedPosts() {
        Date dateOne = new Date(11,12,2019);
        Date dateTwo = new Date(12,3,2020);
        Date dateThree = new Date(10,7,2020);

        Post postOne = new Post("Hello", "Grießbrei Kakao", dateOne, false);
        Post postTwo = new Post("Hello2", "Grießbrei Kakao2", dateOne, false);
        Post postThree = new Post("Hello3", "Grießbrei Kakao3", dateOne, false);
        List<Post> posts = List.of(postOne, postTwo, postThree);
        Blog blog = new Blog("HALLO", posts, dateThree);
        int result = publishedPostCounter.count(blog);
        Assertions.assertEquals(0, result);
    }

    @Test
    void counterWithoutPosts() {
        Date dateOne = new Date(11,12,2019);
        Date dateTwo = new Date(12,3,2020);
        Date dateThree = new Date(10,7,2020);
        List<Post> posts = List.of();
        Blog blog = new Blog("HALLO", posts, dateThree);
        int result = publishedPostCounter.count(blog);
        Assertions.assertEquals(0, result);
    }


}