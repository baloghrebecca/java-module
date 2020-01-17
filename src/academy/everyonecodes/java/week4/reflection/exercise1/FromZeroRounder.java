package academy.everyonecodes.java.week4.reflection.exercise1;

public class FromZeroRounder {

    public Double round(Double number) {
        Double numberCopy = number;
        Double numberAbsolute = Math.abs(numberCopy);
        if(numberCopy.equals(numberAbsolute)) {
            numberCopy = Math.ceil(numberCopy);
        } else {
            numberCopy = Math.floor(numberCopy);
        }
        return numberCopy;
    }

}
