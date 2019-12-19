package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

import java.util.List;

public class Printer {

    public static void print(Magazine magazine) {
        System.out.println(magazine.getTitle());
        List<Article> articles = magazine.getArticles();
        for (Article article : articles) {
            System.out.println(article.getTitle() + " " + article.getArticle());
        }
    }

}
