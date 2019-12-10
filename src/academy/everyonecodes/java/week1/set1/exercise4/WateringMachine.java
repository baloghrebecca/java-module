package academy.everyonecodes.java.week1.set1.exercise4;

public class WateringMachine {

    public static void main(String[] args) {

        int numberOfPlants = 3;
        int numberOfPlantsPlanned = 9;
        int numberOfPlantsTotal = numberOfPlants + numberOfPlantsPlanned;
        int numberOfWateringMachines = 1;
        int numberOfPlantsPerMachine = 4;
        int numberOfWateringMachinesToBuy = (numberOfPlantsTotal / numberOfPlantsPerMachine)-numberOfWateringMachines;
        int machinePrice = 20;
        double discount = 20.00/100;
        int costWithoutDiscount = numberOfWateringMachinesToBuy * machinePrice;
        double costDiscount = costWithoutDiscount * discount;
        double finalCost = costWithoutDiscount-costDiscount;
        System.out.println(finalCost);

    }


}
