package academy.everyonecodes.java.week6.set2.exercise3;

public class TemplateChooser {


    public String choose(String name) {
        if (name.contains("Mr.")) {
            return "male";
        }
        if (name.contains("Mrs.") ||name.contains("Ms.")) {
            return "female";
        }
        if (name.contains("Hokopoko")) {
            return "privileged";
        }
        return "default";
    }
}
