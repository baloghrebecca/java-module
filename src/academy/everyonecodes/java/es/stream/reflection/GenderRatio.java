package academy.everyonecodes.java.es.stream.reflection;

import java.util.List;

public class GenderRatio {

    public String ratio(List<StudentPerformance> performances) {
        long women = performances.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("female"))
                .count();
        long male = performances.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("male"))
                .count();
        if (women > male) {
            return "Gender ratio format: " + women + ":" + male;
        }
        return "Gender ratio format: " + male + ":" + women;

    }


}
