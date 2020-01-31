package academy.everyonecodes.java.week2.lectureExercises.example1;

public class Application {

    public static void main(String[] args) {

        Door doorOne = new Door(1234, "Open Door");
        Key keyOne = new Key("Peter", "Close Door");
        Key keyTwo = new Key("Mike", "Open Door");

        DoorOpener opener = new DoorOpener();

        opener.open(doorOne,keyOne);
        opener.open(doorOne, keyTwo);


    }

}
