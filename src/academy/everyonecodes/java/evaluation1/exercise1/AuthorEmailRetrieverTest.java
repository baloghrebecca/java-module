package academy.everyonecodes.java.evaluation1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AuthorEmailRetrieverTest {


    AuthorEmailRetriever authorEmailRetriever = new AuthorEmailRetriever();

    @ParameterizedTest
    @CsvSource({
            "testone@yahoo.de, testone@yahoo.de, Test One Password, Test One Title, Test One Content",
            "test2@yahoo.de, test2@yahoo.de, Test 2 Password, Test 2 Title, Test 2 Content"

    })

    void retrieverMixedCases(String expected, String email, String password, String title, String content) {
        User author = generateUser(email, password);
        Comment comment = generateComment(title, content, author);
        String result = authorEmailRetriever.retrieve(comment);
        Assertions.assertEquals(expected, result);
    }

    private Comment generateComment(String title, String content, User author) {
        return new Comment(title, content, author);
    }

    private User generateUser(String email, String password) {
        return new User(email, password);
    }


}