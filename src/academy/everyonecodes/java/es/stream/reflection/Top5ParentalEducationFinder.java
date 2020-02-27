package academy.everyonecodes.java.es.stream.reflection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top5ParentalEducationFinder {

    public List<String> finder(List<StudentPerformance> performances) {
        return performances.stream()
                .sorted(Comparator.comparing(StudentPerformance::getMathScore).reversed())
                .limit(5)
                .map(StudentPerformance::getParentalEducation)
                .collect(Collectors.toList());
    }

}
