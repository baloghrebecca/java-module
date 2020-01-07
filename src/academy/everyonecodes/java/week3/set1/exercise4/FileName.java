package academy.everyonecodes.java.week3.set1.exercise4;

import java.util.List;

public class FileName {

     static String generateName(String oldName) {
        int lastPosition = oldName.length() - 4;
        String namePart = oldName.substring(0, lastPosition);
        String newName = namePart + ".png";
        return newName;

    }

     static List<String> getAllPhotoFileNames() {
        List<String> files = List.of("tree.jpg", "kitty.jpg", "dog.jpg");
        return files;
    }

     static void renameFile(String oldName, String newName) {
        System.out.println("Renaming " + oldName + " to " + newName);
    }

    public static void main(String[] args) {
        List<String> fileNames = getAllPhotoFileNames();
        for (String name : fileNames) {
            String newName = generateName(name);
            renameFile(name, newName);
        }

    }
}
