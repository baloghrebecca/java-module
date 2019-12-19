package academy.everyonecodes.java.week2.set2.exercise2;

import static academy.everyonecodes.java.week2.set2.exercise2.Editor.writeMagazine;
import academy.everyonecodes.java.week2.set2.exercise1.Article;

public class Application {

    public static void main(String[] args) {

        Editor editor = new Editor();
        Magazine newMagazine = editor.writeMagazine();

        Printer printer = new Printer();

        printer.print(newMagazine);


    }

    }