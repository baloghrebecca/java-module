package academy.everyonecodes.java.week2.set2.exercise1;

public class Application {

    public static void main(String[] args) {


    Article newArticle = new Article("David's Adventure", "David had a great adventure drinking beer until 3am and then eating a burger afterwards. You go David!");

    Printer printer = new Printer();

    printer.print(newArticle);

    }

}
