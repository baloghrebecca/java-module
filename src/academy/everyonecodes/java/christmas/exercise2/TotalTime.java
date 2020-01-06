package academy.everyonecodes.java.christmas.exercise2;

public class TotalTime {

    public int calculateTotalTime (int tramStations, int walkingTimeHouse, int walkingTimeTram) {
        TramTime tramTimeCalculation = new TramTime();
        WalkingTime walkingTimeCalculation = new WalkingTime();

        int tramTimeTotal = tramTimeCalculation.calculateTramTime(tramStations);
        int walkingTimeTotalHouse = walkingTimeCalculation.calculateWalkingTime(walkingTimeHouse);
        int walkingTimeTotalTram = walkingTimeCalculation.calculateWalkingTime(walkingTimeHouse);

        int totalTravelTime = tramTimeTotal + walkingTimeTotalHouse + walkingTimeTotalTram;
        return totalTravelTime;
    }


}
