package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top5ParentalEducationFinder {
    public List<String> find(List<StudentPerformance> studentPerformanceList) {
        return studentPerformanceList.stream()
                .sorted(sortByHighestMathsScore())
                .limit(5)
                .sorted(sortAgainByHighestMathsScore())
                .map(StudentPerformance::getParentalEducation)
                .collect(Collectors.toList());
    }

    private Comparator<StudentPerformance> sortAgainByHighestMathsScore() {
        return Comparator.comparing(StudentPerformance::getMathScore);
    }

    private Comparator<StudentPerformance> sortByHighestMathsScore() {
        return sortAgainByHighestMathsScore().reversed();
    }
}
