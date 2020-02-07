package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;
import java.util.function.Predicate;

public class GenderRatioCalculator {
    public String calculate(List<StudentPerformance> studentPerformanceList) {
        long femaleStudents = studentPerformanceList.stream()
                .filter(getFemale())
                .count();
        long maleStudents = studentPerformanceList.stream()
                .filter(getMale())
                .count();
        return femaleStudents + ":" + maleStudents;
    }

    private Predicate<StudentPerformance> getMale() {
        return studentPerformance -> !studentPerformance.getGender().contains("fe");
    }

    private Predicate<StudentPerformance> getFemale() {
        return studentPerformance -> studentPerformance.getGender().contains("female");
    }
}
