package academy.everyonecodes.java.week4.set1.exercise2;

import java.util.Random;

public class OneToTenPicker {

    public static int pick(){

        Random random = new Random();

        int number = random.nextInt(10) + 1;
        return number;
    }


}
