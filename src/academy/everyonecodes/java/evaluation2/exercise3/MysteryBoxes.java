package academy.everyonecodes.java.evaluation2.exercise3;

import java.util.List;

public class MysteryBoxes {

    public static List<MysteryBox> get() {
        return List.of(new SpareParts(1), new SpareParts(2), new WeaponsUpgrade(1), new WeaponsUpgrade(2));
    }

}
