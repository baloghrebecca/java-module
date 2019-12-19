package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

import java.util.List;

public class Editor {

    public static Magazine writeMagazine() {
        Article articleOne = new Article("Mario's Adventure", "He saved the prince.");
        Article articleTwo = new Article("Luigi's Adventure", "He saved Mario!");
        Article articleThree = new Article("Yoshi's Adventure", "He was just there.");

        List<Article> articles = List.of(articleOne, articleTwo, articleThree);

        Magazine magazine = new Magazine("Adventure!!!!", articles);
        return magazine;

    }

}
