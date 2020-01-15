package academy.everyonecodes.java.week4.set2.exercise1;


public class MovieTitleFormatter {

    public String format(String movieTitle) {
        movieTitle = movieTitle.trim();
        String editedTitle = "";
        String[] titles = movieTitle.split(" ");
        for (String title : titles) {
            title = title.substring(0,1).toUpperCase()+title.substring(1);
            editedTitle = editedTitle + title + " ";
        }
        editedTitle = editedTitle.trim();
        return editedTitle;
    }

}
